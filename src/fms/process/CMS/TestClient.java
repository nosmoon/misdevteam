package fms.process.CMS;

import java.io.*;
import java.net.*;
import com.sf.xc3.*;

public class TestClient
{
  // Subject Mode
  final int XC_SMODE_CLIENT   = 1;
  final int XC_SMODE_SERVER   = 2;
  final int XC_MTYPE_NEWPROFILE = 300;
  
  // ���� �޽��� Ÿ�� ���� : ���ÿ�
  final int MSGTYPE_SESSION_KEY = 3;    // ����Ű ���� �޽���
  final int MSGTYPE_CIPHER      = 4;    // ��ȣ�� �޽���
  final int MSGTYPE_SUCCESS     = 240;  // ���������� ó����
  final int MSGTYPE_FAILED      = 255;  // ó�� ����
  
  static String IDN   = "0070707105537";
  
  byte [] type = new byte[1];
  
  Socket cs = null;
  DataOutputStream outBound;
  DataInputStream inBound;
    
  XC_v3 xc = null;
    
  final int SERVER_PORT   = 11000;									//������ ǥ�õǾ� �ִ� ��Ʈ��ȣ�� �����ؾ���
  final int MODE          = 1;
  final int TIMEOUT       = 300000;
  final String SERVER_IP  = "121.134.74.70";					//������ ǥ�õǾ� �ִ� IP�� �����ؾ���
  final String CONF       = "D:/xc30_64/conf/xc_conf.txt"; 	//�ش� ������ ��ġ�� �����ؾ���.
  final String PLAINMSG   = "SsdsitesttesttestswswtestswswswswMEMA20111027                                                                                                                                     fms  \r\n";
 
  
  public static void main(String[] args) throws InterruptedException
  {
    
    TestClient ts = new TestClient();
    ts.init();              //���̺귯�� �ʱ�ȭ
    ts.cipherTest();    	//�Ϻ�ȣ �׽�Ʈ
    ts.end();				//���� ����
  }
  
  public void init()
  {
    // ���� �ʱ�ȭ
    try
    {
      xc = new XC_v3();
      int ret = xc.init("", CONF, MODE);
      if ( ret < 0 )
      {
        System.out.println("init returned [" + ret + "]");
        System.exit(-1);
      }
        System.out.println("[Connect] " + SERVER_IP + " : "+SERVER_PORT);
        cs = new Socket(SERVER_IP, SERVER_PORT);
                
      outBound = new DataOutputStream(cs.getOutputStream());
      inBound = new DataInputStream(cs.getInputStream());
    }
    catch (Exception e) {
      System.out.println("Exception occurred : (" + e.getMessage() + ")");
      xc.error(null);
      System.exit(-1);
    }
  }
  
  public void end()
  {
    try
    {
      inBound.close();
      outBound.close();
      cs.close();
      xc.close();
    }
    catch (IOException e)
    {
      System.out.println("Socket Close Error : " + e.getMessage());
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
  }
  
  public void cipherTest()
  {
    byte [] input = null;
    byte [] output  = null;
    byte [] encstr  = null;
    int  output_len = 0;
    int  input_len = 0;
    int  ret;
    
    try 
    {
      /*����Ű��ȯ ����*/
      //key Init
      output = xc.keyinitBin();
      type[0] = MSGTYPE_SESSION_KEY;
      output_len = output.length;
      xmTokenWrite(output);
    
      //key Final
      input = xmTokenRead();
      //xc.binout(input, input.length);

      ret = xc.keyFinal(input);

      //for newprofile(newprofile = 300)
      if(ret == XC_MTYPE_NEWPROFILE)
      {
        System.out.println("Retrying Key Init");
        output = xc.keyinitBin();
        type[0] = MSGTYPE_SESSION_KEY;
              
        output_len = output.length;
        //xc.binout(output, output_len);
        xmTokenWrite(output);
    
        input = xmTokenRead();
       // xc.binout(input, input.length);
        ret = xc.keyFinal(input);
      }
      
      System.out.println("");
      System.out.println("Key Final OK :");
      System.out.println("");
      /*����Ű��ȯ �Ϸ�*/
      
      //encode(to server)
      type[0] = MSGTYPE_CIPHER;
      output = xc.encode(PLAINMSG.getBytes());
      output_len = output.length;
      //xc.binout(output, output_len);
      xmTokenWrite(output);
      
      
      //decode(from server)
      encstr = xmTokenRead(); 
      input = xc.decode(encstr);
      input_len = input.length;
     
      String str  = new String(input,0,input_len,"EUC-KR"); 
      System.out.println("Server send the message :"+str);
     
    }
    catch(Exception e) {
      e.printStackTrace();
      xc.error(null);
    }
  }
    

    /** 
   * byte[] xmTokenRead(byte[] type) throws EOFException, IOException, Exception
   * ���𿡼� ������ Ŭ���̾�Ʈ/���� �������ݿ� ���� Ŭ���̾�Ʈ���� �����͸� �д� �޽��
   */
  byte[] xmTokenRead() throws EOFException, IOException, Exception
  {
    byte[] data = null;
    int nData = 0;
    
    try {
      cs.setSoTimeout(TIMEOUT);
      /**
      *  Read Message Header
      */
      // Read Message Type
      type[0] = inBound.readByte();
      
      // Read Message Length
      nData = (inBound.readUnsignedByte() << 8);
      nData += inBound.readUnsignedByte();
      /** 
      * Read Message
      */
      // Allocate Message Data Buffer
      if (nData < 0) {
        System.out.println("FATAL : readFully read invalid data");
        throw new Exception();
      }
      data = new byte[nData];
      // Read Message Data
      inBound.readFully(data);
      // XCDebug.printHex(data);
    }
    catch (EOFException e) {
      throw new EOFException();
    }
    catch (IOException e) {
      System.out.println("Read Failed : " + e.getMessage());
      throw new IOException();
    }
    
    return data;
  }
    
    
  /** 
   * void xmTokenWrite(byte[] type, byte[] data) throws IOException
   * ���𿡼� ������ Ŭ���̾�Ʈ/���� �������ݿ� ���� Ŭ���̾�Ʈ�� �����͸� �����ϴ� �޽��
   */
  void xmTokenWrite(byte[] data) throws IOException
  {
    int len1 = 0;
    int len2 = 0;
    
    byte[] sendData = new byte[data.length + 3];
    
    try {
      //cs.setSoTimeout(TIMEOUT);
      /**
      * Parse Message Header
      */
      
      // message type
      sendData[0] = type[0];
      
      // message length
      len1 = (data.length >> 8) & 0x000000FF;
      len2 = data.length & 0x000000FF;
      
      sendData[1] = (byte)len1;
      sendData[2] = (byte)len2;
        
      // generate message
      System.arraycopy(data, 0, sendData, 3, data.length);
      // send header & message
      outBound.write(sendData);
      
      //XCDebug.printHex(sendData);
    }
    catch (IOException e) {
      System.out.println("Write failed : " + e.getMessage());
      throw new IOException();
    }
  }
}
