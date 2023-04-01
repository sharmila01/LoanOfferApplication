package com.business;
import com.dto.request.CreateOrderReq;
import com.dto.request.GetOrderDetailReq;
import com.dto.response.CommonResponse;
import com.dto.response.Product;
import com.dto.response.Category;
import java.util.List;
public interface OrderBusiness {
    /**
     * getAllProducts
     * @return
     */
    List<Product> getAllProducts();

    /**
     * getAllCategories
     * @return
     */
    List<Category> getAllCategories();
    /**
     * getOrderSingleCalculation
     * @param getOrderDetailReq
     * @return
     */
    CommonResponse getOrderSingleCalculation(GetOrderDetailReq getOrderDetailReq);

    /**
     * placeOrder
     * @param createOrderReq
     * @return
     */
    CommonResponse placeOrder(CreateOrderReq createOrderReq);
}
