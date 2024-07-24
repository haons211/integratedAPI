package vn.haons.demoshippingfee3rdapi.controller;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.haons.demoshippingfee3rdapi.service.GHNShippingService;

@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequestMapping("test")
public class ShippingController {

//
    GHNShippingService shippingService;

//    @GetMapping("/calFee")
//    public ResponseEntity<ShippingFeeResponse> caculateFeeShipping(@RequestBody ShippingFeeRequest request) {
//        ShippingFeeResponse response = shippingService.calculateShippingFee(request);
//        return ResponseEntity.ok(response);
//    }
    @GetMapping("/province")
    public ResponseEntity<Object>GetProvince(){
        return ResponseEntity.ok(shippingService.getProvince());
    }
}
