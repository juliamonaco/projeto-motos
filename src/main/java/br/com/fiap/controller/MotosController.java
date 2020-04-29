package br.com.fiap.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.fiap.model.MotosModel;
import br.com.fiap.repository.MotosRepository;

@Controller
@RequestMapping("/motos")
public class MotosController {

	public MotosRepository repository = MotosRepository.getInstance();

	@GetMapping("/form")
	public String open(@RequestParam String page, 
			@RequestParam(required = false) Long id,
			@ModelAttribute("motosModel") MotosModel motosModel, 
			Model model) {

		if ("motos-editar".equals(page)) {
			model.addAttribute("motosModel", repository.findById(id));
		}
		return page;
	}
	
	@GetMapping()
	public String findAll(Model model) {

		model.addAttribute("motos", repository.findAll());
		return "motos";
	}

	@GetMapping("/{id}")
	public String findById(@PathVariable("id") long id, Model model) {

		model.addAttribute("motos", repository.findById(id));
		return "motos-detalhe";
	}

	@PostMapping()
	public String save(@Valid MotosModel motosModel, 
			BindingResult bindingResult, 
			RedirectAttributes redirectAttributes) {
		
		if(bindingResult.hasErrors()) {
			return "motos-novo";
		}
		
		repository.save(motosModel);
		redirectAttributes.addFlashAttribute("messages", "Moto cadastrada com sucesso");
		
		return "redirect:/motos";
	}

	@PutMapping("/{id}")
	public String update(@PathVariable("id") long id, @Valid MotosModel motosModel, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
		
		if(bindingResult.hasErrors()) {
			return "motos-editar";
		}
		
		motosModel.setId(id);
		repository.update(motosModel);
		redirectAttributes.addFlashAttribute("messages", "Moto alterada com sucesso");
		
		return "redirect:/motos";
	}

	@DeleteMapping("/{id}")
	public String deleteById(@PathVariable("id") long id,
			RedirectAttributes redirectAttributes) {
		
		repository.deleteById(id);
		redirectAttributes.addFlashAttribute("messages", "Moto deletada com sucesso");

		return "redirect:/motos";
	}

}
