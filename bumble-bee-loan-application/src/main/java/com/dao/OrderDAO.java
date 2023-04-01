package com.dao;

import com.dto.request.CreateOrderReq;
import com.dto.request.GetOrderDetailReq;
import com.dto.response.CommonResponse;
import com.dto.response.GetOrderDetailRes;
import com.dto.response.Product;
import com.dto.response.Category;

import java.util.List;
import java.util.Locale;

public interface OrderDAO {

    /**
     * getAllProducts
     * @return
     */
    public List<Product> getAllProducts();

    public List<Category> getAllCategories();
    /**
     * getOrderSingleCalculation
     * @param getOrderDetailReq
     * @return
     */
    CommonResponse getOrderSingleCalculation(GetOrderDetailReq getOrderDetailReq);

    /**
     * placeOrder
     * @param createOrderReq
     * @param orderRequest
     * @return
     */
    CommonResponse placeOrder(CreateOrderReq createOrderReq, String orderRequest);
}
