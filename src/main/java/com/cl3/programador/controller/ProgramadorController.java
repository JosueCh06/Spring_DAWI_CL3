package com.cl3.programador.controller;

import java.io.File;
import java.io.OutputStream;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cl3.programador.entity.Programador;
import com.cl3.programador.service.ProgramadorService;
import com.cl3.programador.service.ProyectoService;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;


@Controller
@RequestMapping("/programador")
public class ProgramadorController {
	
	@Autowired
	private ProyectoService proyectoService;
	
	@Autowired
	private ProgramadorService programadorService;
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("proyectos",proyectoService.listAll());
		model.addAttribute("programadores",new Programador());
		return "programador";
	}

	@RequestMapping("/grabar")
	public String grabar(@ModelAttribute Programador bean,RedirectAttributes redirec) {
		try {
			programadorService.registrar(bean);
			redirec.addFlashAttribute("MENSAJE","Registro guardado");
			
		} catch (Exception e) {
			redirec.addFlashAttribute("MENSAJE","Error en el registro");
			e.printStackTrace();
		}
		return "redirect:/programador/";
	}
	
	@RequestMapping("/consulta")
	@ResponseBody
	public List<Programador> consulta(@RequestParam("codigo") int cod) {
		return programadorService.listarAllPorProyecto(cod);
	}
	
	@RequestMapping("/reporte")
	public void programadores(HttpServletResponse response,@RequestParam("codigo") int cod) {
		try {
			List<Programador> lista = programadorService.listarAllPorProyecto(cod);
			File file=ResourceUtils.getFile("classpath:ReporteProgramadorXProyecto.jrxml");
			JasperReport jasper=JasperCompileManager.compileReport(file.getAbsolutePath());
			JRBeanCollectionDataSource data=new JRBeanCollectionDataSource(lista);
			JasperPrint jasperPrint=JasperFillManager.fillReport(jasper,null, data); 
			response.setContentType("application/pdf");
			OutputStream salida=response.getOutputStream();
			JasperExportManager.exportReportToPdfStream(jasperPrint, salida);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
