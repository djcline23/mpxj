
package net.sf.mpxj;

import java.util.Date;

public class ResourceRate
{

   private Date effectiveDate;
   private double maxUnitsPerTime;

   public ResourceRate(Date date, double units)
   {
      this.effectiveDate = date;
      this.maxUnitsPerTime = units;
   }

   public Date getEffectiveDate()
   {
      return effectiveDate;
   }

   public void setEffectiveDate(Date date)
   {
      this.effectiveDate = date;
   }

   public double getMaxUnitsPerTime()
   {
      return maxUnitsPerTime;
   }

   public void setMaxUnitsPerTime(double units)
   {
      this.maxUnitsPerTime = units;
   }

}
