package com.example.demo.bootstrap;

import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.InhousePart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.InhousePartRepository;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;
    private final InhousePartRepository inhousePartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, InhousePartRepository inHousePartRepository, OutsourcedPartRepository outsourcedPartRepository, InhousePartRepository inhousePartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
        this.inhousePartRepository = inhousePartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        if(productRepository.count() == 0 && partRepository.count() == 0) {

            InhousePart d = new InhousePart();
            d.setName("Driver");
            d.setInv(300);
            d.setPrice(100.00);
            d.setId(1000);
            d.setMin(10);
            d.setMax(1000);
            inhousePartRepository.save(d);

            InhousePart p = new InhousePart();
            p.setName("Putter");
            p.setInv(200);
            p.setPrice(50.00);
            p.setMin(5);
            p.setMax(1000);
            p.setId(1001);
            inhousePartRepository.save(p);

            InhousePart wo = new InhousePart();
            wo.setName("Fairway Wood");
            wo.setInv(200);
            wo.setPrice(75.00);
            wo.setMin(10);
            wo.setMax(1000);
            wo.setId(1002);
            inhousePartRepository.save(wo);

            InhousePart we = new InhousePart();
            we.setName("Wedge");
            we.setInv(400);
            we.setPrice(50.00);
            we.setMin(1);
            we.setMax(800);
            we.setId(1003);
            inhousePartRepository.save(we);

            InhousePart i = new InhousePart();
            i.setName("7 Iron");
            i.setInv(400);
            i.setPrice(75.00);
            i.setMin(5);
            i.setMax(1000);
            i.setId(1004);
            inhousePartRepository.save(i);

            InhousePart b = new InhousePart();
            b.setName("Stand Bag");
            b.setInv(50);
            b.setPrice(100.00);
            b.setMin(5);
            b.setMax(500);
            b.setId(1005);
            inhousePartRepository.save(b);


            List<OutsourcedPart> outsourcedParts = (List<OutsourcedPart>) outsourcedPartRepository.findAll();
            for (OutsourcedPart part : outsourcedParts) {
                System.out.println(part.getName() + " " + part.getCompanyName());
            }


            Product starterSet = new Product("Starter Set", 200.00, 40);
            Product deluxeSet = new Product("Deluxe Set", 400.00, 50);
            productRepository.save(starterSet);
            productRepository.save(deluxeSet);
            Product wedgeSet = new Product("Wedge Set", 150.0, 75);
            productRepository.save(wedgeSet);
            Product ironSet = new Product("Iron Set", 200.0, 30);
            productRepository.save(ironSet);
            Product distanceSet = new Product("Distance Set", 225.0, 40);
            productRepository.save(distanceSet);


            System.out.println("Started in Bootstrap");
            System.out.println("Number of Products" + productRepository.count());
            System.out.println(productRepository.findAll());
            System.out.println("Number of Parts" + partRepository.count());
            System.out.println(partRepository.findAll());
        }

    }
}
