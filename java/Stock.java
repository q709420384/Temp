class Stock{
  String symbol;
  String name;
  double previousClosingPrice;
  double currentPrice;
  public Stock(String s,String n)
  {
    symbol=s;
    name=n;
  }
  public double changePercent()
  {
    return -(previousClosingPrice-currentPrice)/previousClosingPrice;
  }
  
}
