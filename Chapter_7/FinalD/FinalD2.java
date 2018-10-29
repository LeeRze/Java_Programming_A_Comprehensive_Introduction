// Return a String object.
class ErrorMsg {

  // Error codes.
  final static int OUTERR    = 0;
  final static int INERR     = 1;
  static final int DISKERR   = 2;
  static final int INDEXERR  = 3;

  String[] msgs = {

    "Output Error",
    "Input Error",
    "Disk Full",
    "Index Out-Of-Bounds"

  };

  // Return the error message.
  String getErrorMsg(int i) {

    if (i >= 0 & i < msgs.length)
      return msgs[i];
    else
      return "Invalid Error Code";

  }

}

class FinalD2 {

  public static void main(String[] args) {

    ErrorMsg err = new ErrorMsg();
   
    System.out.println(err.getErrorMsg(ErrorMsg.OUTERR));
    System.out.println(err.getErrorMsg(ErrorMsg.DISKERR));

  }

}
