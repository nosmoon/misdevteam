package fms.comm_module;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;

import com.sf.xc3.XC_v3;

public class XC_JavaSocket implements BaseAction
{
	// Subject Mode
	public static final int XC_SMODE_CLIENT		= 1;
	public static final int XC_SMODE_SERVER		= 2;
	
	public static final int XC_MTYPE_NEWPROFILE	= 300;
	
	// ���� �޽��� Ÿ�� ���� : ���ÿ�
	public static final int MSGTYPE_SESSION_KEY	= 3;	// ����Ű ���� �޽���
	public static final int MSGTYPE_CIPHER		= 4;	// ��ȣ�� �޽���
	public static final int MSGTYPE_SIGNED		= 16;	// ���ڼ��� �޽���
	public static final int MSGTYPE_IDV			= 17;	// ����Ȯ�� �޽���
	public static final int MSGTYPE_SIGNED_IDV	= 18;	// ���ڼ���-����Ȯ�� �޽���
	public static final int MSGTYPE_SUCCESS		= 240;	// ���������� ó����
	public static final int MSGTYPE_FAILED		= 255;	// ó�� ����
	
	
	Socket cs = null;
   	DataOutputStream outBound;
   	DataInputStream inBound;

   	XC_v3 xc = new XC_v3();
   	
	
	final int TIMEOUT			= 2*60*1000; //���� ���ð� 
	//final String CONF			= "D:/xc30/conf/xc_conf.txt";		// ��ο� �°� �������ֽʽÿ�.
	//final String CONF           = "*******/webstore/pub/ciis/x30/conf/xc_conf.txt";	//�������
	//final String CONF           = "/webstore/pub/ciis/x30/conf/xc_conf.txt";	//���߼�����
	final String CONF           = "C:\\xc30_32bit_n\\conf\\xc_conf.txt";	//local pc

	
	public int close()
	{
		int ret=-1;
		try{
			inBound.close();
			outBound.close();
			cs.close();
			xc.close();
			ret=1;
		}catch (Exception e){}
		
		return ret;
	}

	public int connect(String ip, int port) {

		int ret =-999;
		try	{			
			 cs = new Socket(ip, port);
	            
	            outBound = new DataOutputStream(cs.getOutputStream());
				inBound = new DataInputStream(cs.getInputStream());
				cs.setSoTimeout(TIMEOUT);
        	
			ret = xc.init("", CONF, 1);
			
			
			if ( ret < 0 ){
				System.out.println("init returned [" + ret + "]");
				return ret;
			}
        	
           
			
			//key Init
			byte [] output	= null;
			int output_len=-1;
			output = xc.keyinitBin();
			output_len = output.length;
			
			byte[] sendData = new byte[output_len + 3];

			
			byte[] data = null;
	        try {
	            cs.setSoTimeout(TIMEOUT);
	            /**
	             * Parse Message Header
	             */
	            
	            // message type
	            sendData[0] = MSGTYPE_SESSION_KEY;
	            
	            // message length
	            sendData[1] = (byte)((byte)(output.length >> 8) & 0x000000FF);
	            sendData[2] = (byte)((byte)output.length & 0x000000FF);
	                        
	            // generate message
	            System.arraycopy(output, 0, sendData, 3, output.length);
	            // send header & message
	            outBound.write(sendData);
	            
			
	            
	            int nData = 0;
	            
	            try {
	                //cs.setSoTimeout(TIMEOUT);
	    	        /**
	    	         *  Read Message Header
	    	         */
	    	        // Read Message Type
	                inBound.readByte();
	    	        
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
	            }catch (EOFException e) {
	                throw new EOFException();
	            }catch (IOException e) {
	                System.out.println("Read Failed : " + e.getMessage());
	                throw new IOException();
	            }
		
				//key Final
				ret = xc.keyFinal(data);
				if(ret<0){
					System.out.println("key final return : " + ret);
					System.out.println("");
					System.out.println("Key Final Fail :");
					System.out.println("");
					return ret;
				}
	        }catch (Exception e) {
	        	e.printStackTrace();
	            System.out.println("Exception occurred : (" + e.getMessage() + ")");
	            xc.error(null);
	        }
		}catch(Exception e){
			e.printStackTrace();
			return ret;
		}
		System.out.println(">>>���� ���� ���� \n���� ���� ���� : "+ ip + ":" + port );
		System.out.println("ret:" + ret );
		return ret;
	}
	
	public byte[] recvData() {
		byte[] data = null;
        int nData = 0;
        
        try {
            //cs.setSoTimeout(TIMEOUT);
	        /**
	         *  Read Message Header
	         */
	        // Read Message Type
            inBound.readByte();
	        
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
	        System.out.println("���Ŵ�� ��ȣ�� ũ�� : " + nData    		);
	        data = new byte[nData];
            // Read Message Data
            inBound.readFully(data);
            // XCDebug.printHex(data);
            data = xc.decode(data);
        }catch (Exception e) {
        	
            System.out.println("Read Failed : " + e.getMessage());
        }
        return data;
	}

	public boolean sendData(String data) {
		
		try {
			byte [] b_data = data.getBytes("EUC-kr");
			b_data = xc.encode(b_data);
			int len1 = 0;
	    	int len2 = 0;
	    	byte[] sendData = new byte[b_data.length + 3];

       
            //cs.setSoTimeout(TIMEOUT);
            /**
             * Parse Message Header
             */
            
            // message type
            sendData[0] = MSGTYPE_CIPHER;
            
            // message length
            len1 = (b_data.length >> 8) & 0x000000FF;
            len2 = b_data.length & 0x000000FF;
            
            sendData[1] = (byte)len1;
            sendData[2] = (byte)len2;
                        
            // generate message
            System.arraycopy(b_data, 0, sendData, 3, b_data.length);
            // send header & message
            outBound.write(sendData);
            
            //XCDebug.printHex(sendData);
        }catch (Exception e) {
            System.out.println("Write failed : " + e.getMessage());
            return false;
        }
        
		return true;
	}
    
}
