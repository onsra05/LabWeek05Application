package vn.edu.iuh.fit.frontend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import vn.edu.iuh.fit.backend.models.Address;
import vn.edu.iuh.fit.backend.repositories.AddressRepository;

import java.util.List;

@Controller
@RequestMapping("/addresses")
public class AddressController {

    @Autowired
    private AddressRepository addressRepository;

    @GetMapping
    public String listAddresses(Model model) {
        List<Address> addresses = addressRepository.findAll();
        model.addAttribute("addresses", addresses);
        return "candidates/address/listad";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("address", new Address());
        return "candidates/address/editAd";
    }

    @PostMapping("/add")
    public String saveAddress(@ModelAttribute Address address) {
        addressRepository.save(address);
        return "redirect:addresses/add";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        Address address = addressRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid address ID: " + id));
        model.addAttribute("address", address);
        return "candidates/address/editAd";
    }

    @PostMapping("/edit/{id}")
    public String updateAddress(@PathVariable Long id, @ModelAttribute Address address) {
        address.setId(id);
        addressRepository.save(address);
        return "redirect:/addresses";
    }

    @GetMapping("/delete/{id}")
    public String deleteAddress(@PathVariable Long id) {
        Address address = addressRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid address ID: " + id));
        addressRepository.delete(address);
        return "redirect:/addresses";
    }
}
