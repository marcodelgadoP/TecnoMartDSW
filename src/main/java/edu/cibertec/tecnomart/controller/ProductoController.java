package edu.cibertec.tecnomart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.cibertec.tecnomart.entity.Producto;
import edu.cibertec.tecnomart.service.MarcaService;
import edu.cibertec.tecnomart.service.ProductoService;

@Controller
@RequestMapping("/producto")
public class ProductoController {

	@Autowired
	private ProductoService serviceProducto;
	
	@Autowired
	private MarcaService serviceMarca;

		
	@GetMapping("/listadoP")
	public String listadoProducto(Model model) {
	    List<Producto> producto = serviceProducto.listadoProducto();
	    model.addAttribute("productos", producto);
	    model.addAttribute("productoo", new Producto());
	    model.addAttribute("listamarca", serviceMarca.listarMarca());
	    return "producto/listadoProducto";
	}
	
	@GetMapping("/ir/registro")
	public String irRegistroProducto(Model model) {
		model.addAttribute("producto", new Producto());
		return "producto/registrarProducto";
	}
	
	@PostMapping("/registro")
	public String ingresarProducto(@ModelAttribute Producto producto, Model model) {
		try {
			model.addAttribute("productoo", new Producto());
			serviceProducto.insertarProducto(producto);
			model.addAttribute("productos", serviceProducto.listadoProducto());
			model.addAttribute("listamarca", serviceMarca.listarMarca());
		} catch (Exception e) {

			System.out.println(e);
		}		
		return "producto/registrarProducto";
	}

	
	
	@PostMapping("/obtenerid")
	public String obtenerIdProducto(@RequestParam("idproducto") int idproducto, Model model) {
	
		model.addAttribute("cliente", serviceProducto.obtenerProducto(idproducto));
	    
	   return "producto/actualizarProducto";
	}
	
	@PostMapping("/actualizar")
	public String actualizacionProducto(@ModelAttribute Producto producto, @RequestParam("idproducto") int idproducto ,Model model) {
		try {
			model.addAttribute("cliente", serviceProducto.actualizarProducto(producto));
			System.out.println("el codigo es:" + idproducto);
			
		} catch (Exception e) {
			System.out.println("El codigo es:" + e);
		}
		
	    List<Producto> productos = serviceProducto.listadoProducto();
	    model.addAttribute("productos", productos);
		
		return "producto/listadoProducto";
	}
	
	@ControllerAdvice
	public class GlobalExceptionHandler {
	    @ExceptionHandler(Exception.class)
	    public String handleException(Exception ex) {
	        // Personaliza el manejo de la excepción y devuelve una vista de error personalizada
	        return "error";
	    }
	}
	
}
