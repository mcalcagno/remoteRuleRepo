package demo.cartpromofact;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Cart implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.String id;
   private demo.cartpromofact.User user;
   private java.util.List<demo.cartpromofact.CartEntry> entries;

   private java.lang.Double amount;

   private java.lang.String message;

   public Cart()
   {
   }

   public java.lang.String getId()
   {
      return this.id;
   }

   public void setId(java.lang.String id)
   {
      this.id = id;
   }

   public demo.cartpromofact.User getUser()
   {
      return this.user;
   }

   public void setUser(demo.cartpromofact.User user)
   {
      this.user = user;
   }

   public java.util.List<demo.cartpromofact.CartEntry> getEntries()
   {
      return this.entries;
   }

   public void setEntries(java.util.List<demo.cartpromofact.CartEntry> entries)
   {
      this.entries = entries;
   }

   public java.lang.Double getAmount()
   {
      return this.amount;
   }

   public void setAmount(java.lang.Double amount)
   {
      this.amount = amount;
   }

   public java.lang.String getMessage()
   {
      return this.message;
   }

   public void setMessage(java.lang.String message)
   {
      this.message = message;
   }

   public Cart(java.lang.String id, demo.cartpromofact.User user,
         java.util.List<demo.cartpromofact.CartEntry> entries,
         java.lang.Double amount, java.lang.String message)
   {
      this.id = id;
      this.user = user;
      this.entries = entries;
      this.amount = amount;
      this.message = message;
   }

}