package com.tecsup.lab11.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class controller {
    @GetMapping("/verNumerosPrimos")
    public String verNumerosPrimos(
            @RequestParam int inicio,
            @RequestParam int fin,
            Model model
    ) {
        List<Integer> numerosPrimos = calcularNumerosPrimosEntre(inicio, fin);
        model.addAttribute("numerosPrimos", numerosPrimos);
        return "resultados";
    }

    private List<Integer> calcularNumerosPrimosEntre(int inicio, int fin) {
        List<Integer> numerosPrimos = new ArrayList<>();
        for (int i = inicio; i <= fin; i++) {
            if (esPrimo(i)) {
                numerosPrimos.add(i);
            }
        }

        return numerosPrimos;
    }

    private static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }

    @GetMapping("/verTablaMultiplicar")
    public String verTablaMultiplicar(
            @RequestParam int numeroTabla,
            Model model
    ) {
        List<ResultadoMultiplicacion> resultadosMultiplicacion = generarTablaMultiplicar(numeroTabla);
        model.addAttribute("resultadosMultiplicacion", resultadosMultiplicacion);
        return "resultados2";
    }

    public List<ResultadoMultiplicacion> generarTablaMultiplicar(int numeroTabla) {
        List<ResultadoMultiplicacion> resultadosMultiplicacion = new ArrayList<>();

        for (int i = 1; i <= 12; i++) {
            int resultado = numeroTabla * i;
            boolean esPar = resultado % 2 == 0;
            resultadosMultiplicacion.add(new ResultadoMultiplicacion(resultado, esPar));
        }

        return resultadosMultiplicacion;
    }

}
