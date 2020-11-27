package practice;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class UtcTimeConvertor {

  public static void main(String[] args) throws ParseException {
    String ISO_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSSX";
    DateFormat dateFormat = new SimpleDateFormat(ISO_FORMAT);

    int beginDate = 1;
    int endDate = 30;

    for (int i = beginDate; i <= endDate; i++) {

      String s = "";
      if (i < 10) {
        s = "0" + i;
      } else {
        s += i;
      }

      String startDateStr = String.format("2020-11-%sT00:00:00.000Z", s);

      String endDateStr = String.format("2020-11-%sT23:59:00.000Z", s);

      long startTime = dateFormat.parse(startDateStr).getTime();

      long endTime = dateFormat.parse(endDateStr).getTime();
      System.out.println(startDateStr);
      String queryString =
          String.format(
              "select count(*) from `fulfilmentorderprocessor` where  "
                  + "fulfilmentSlotStartTime >= %s and fulfilmentSlotStartTime <= %s and orderStatus='RECEIVED' "
                  + "and any fulfilmentPointAction in fulfilmentPointActions satisfies fulfilmentPointAction.fulfilmentPoint.branchNumber=“3377” END;",
              startTime, endTime);

//      String queryString =
//              String.format(
//                      "select  fulfilmentOrderId,customerOrderShortId,version from `fulfilmentorderprocessor` where  "
//                              + "fulfilmentSlotStartTime >= %s and fulfilmentSlotStartTime <= %s and orderStatus='RECEIVED' "
//                              + "and any fulfilmentPointAction in fulfilmentPointActions satisfies fulfilmentPointAction.fulfilmentPoint.branchNumber=“3377” END order by customerOrderShortId asc;",
//                      startTime, endTime);
      System.out.println(queryString);
      System.out.println();
    }
  }
}
