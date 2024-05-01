package com.xworkz.printer.service;

import com.xworkz.printer.dto.PrinterDto;
import com.xworkz.printer.repository.PrinterRepository;
import com.xworkz.printer.repository.PrinterRepositoryImplementation;

public class PrinterServiceImplementation implements PrinterService {
    private PrinterRepository printerRepository = new PrinterRepositoryImplementation();

    @Override
    public boolean validateAndSave(PrinterDto printerDto) {
        if (printerDto != null) {
            if (printerDto.getPrinterName() != null && printerDto.getPrice() > 0 && printerDto.getBrand() != null) {
                boolean saved = printerRepository.save(printerDto);
                if (saved) {
                    System.out.println("Printer saved successfully");
                    return true;
                }
            } else {
                System.out.println("Invalid PrinterDto fields");
            }
        }
        return false;
    }
}
