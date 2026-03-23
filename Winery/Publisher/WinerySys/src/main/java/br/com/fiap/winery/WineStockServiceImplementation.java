package br.com.fiap.winery;

import jakarta.jws.WebService;

@WebService(endpointInterface = "br.com.fiap.winery.WineStockService")
public class WineStockServiceImplementation implements WineStockService {

    @Override
    public String getMenu() {
        return "Menu de Vinhos:\n" +
                "1. Cabernet Sauvignon\n" +
                "2. Merlot\n" +
                "3. Chardonnay\n" +
                "4. Pinot Noir\n" +
                "5. Sauvignon Blanc";
    }

    @Override
    public String placeOrder(String name, int quantity) {
        return "Pedido confirmado!";
    }
}
