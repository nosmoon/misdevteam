<%@ page contentType="text/xml; charset=euc-kr" %>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common_x.jsp"%>

<%---------------------------------------------------------------------------------------------------
* ���ϸ�	: sl_reader_1410_a.jsp
* ���		: ����-������������-��ü��û�˾�-ī������
* �ۼ�����	: 2004-05-26
* �ۼ���	: ���

* ��������	:
* ������	:
* �������� 	:
* ������ϸ�:
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: Ȳ����
* ��������	: 2009-04-08
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>



<jsp:useBean id="KSMpiIspBean" class="com.ksnet.card.KSMpiIspBean" scope="page"></jsp:useBean>
<%
	/*
        JSP Name : CertifyReq.jsp

        ���� �ۼ����� : 2004/05/19
        ���� �ۼ���   : ����
        ���� �������� :
        ���� ������   :
        */

	//String	IP		= "210.181.29.11";
	String	IP		= "210.181.28.137";
	int		PORT	= 7131;

	String GUBUN 	= "1110";   		//	������û ��������
	String posMode 	= "K";    			//	Pos Entry Mode �ʱ�ȭ  K : key-IN S:Swipe
	String goveCode = "11111";    		//	��ޱ���ڵ�

	String tid		= "DPT0006501";		//	Test �ܸ��� ��ȣ - ���� �ܸ��� ��ȣ ���� ���
	String secType	= "1";				//	��ȣȭ ����
	String  _sendData   = "";
	String sendType = "1";				//	ī���������۱��� 1:����� ī������ ���� ���
	String cardName	= "";

	String cardNo	= ""; // ī���ȣ
	String expiry	= ""; // ��ȿ���( YYMM )
	String juminNo	= ""; // �ֹι�ȣ ���ڸ� (7�ڸ�)

    String  vantr       = "";
    String  msg1        = "";
    String  msg2        = "";
    String  msg3        = "";
    String  msg4        = "";
    String  status      = "";
    String  authdttm    = "";
    String  authno      = "";
    String  _error      = "";
    String stLen        = "" ;
    String secureType   = "" ;
    String stVer        = "" ;
    String stTid        = "" ;
    String stsn         = "" ;
    String timeOut      = "" ;
    String adminName    = "" ;
    String issue        = "" ;
    String installment  = "" ;
    String acquire      = "" ;
    String merID        = "" ;
    String adminTel     = "" ;
    String adminMobile  = "" ;
    String totAmount    = "" ;
    String merNo        = "" ;
    String notice       = "" ;
    String occurPoint   = "" ;
    String usablePoint  = "" ;
    String accuPoint    = "" ;
    String pointMsg     = "" ;
    String merUse       = "" ;

	try{
		cardNo	= request.getParameter("cardno");
		expiry	= request.getParameter("expiry");
		juminNo	= request.getParameter("jumin");

		//out.println(cardNo +"/" + expiry+"/"+juminNo );

	} catch (NullPointerException e) {
		throw new Exception("����Ÿ�� NULL���� �����մϴ�.�ٽ� �Է��� �ּ���.");
	}

	// �ʱ� ȯ�� �����Լ� (IP / PORT )
	KSMpiIspBean.argSetInitConf(IP,PORT);

	// �ʱ� �α� ȯ�� �����Լ� (�α���丮 / �����α���丮)
	KSMpiIspBean.argSetInitLog("/was/salesdept/log/ksnet/log","Y","/was/salesdept/log/ksnet/errlog","Y");

	// ��ȣȭ �����ʵ� 0:��ȣȭ ���� 2:��
	KSMpiIspBean.argSetSecureType(secType);

	// �ܸ��� ��ȣ �ʱ�ȭ
	KSMpiIspBean.argSetTermId(tid);

	// ��ޱ���ڵ� �ʱ�ȭ
	KSMpiIspBean.argSetGoveCode(goveCode);

	// ���α��� �ʱ�ȭ
	KSMpiIspBean.argSetAuthGubun(GUBUN);

	// Pos Entry Mode �ʱ�ȭ  K : key-IN S:Swipe
	KSMpiIspBean.argSetPosEntMode(posMode);

	// ī���ȣ �ʱ�ȭ
	KSMpiIspBean.argSetCardno(cardNo);

	// ��ȿ��� �ʱ�ȭ
	KSMpiIspBean.argSetExpiry(expiry);

	// �ֹι�ȣ �ʱ�ȭ
	KSMpiIspBean.argSetJuminNBuss(juminNo);

	// ������������
	KSMpiIspBean.argSetCertiGubun(" ");

	// ī������ ���۱���
	KSMpiIspBean.argSetSendInfo(sendType);

	// ���ο�û ���� ����,���� �� �������
	try{
		_sendData = KSMpiIspBean.argMakeSendData();
	}catch(Exception e){
		System.out.println(e.toString());
	}

	//out.println(_sendData);
	_error = KSMpiIspBean.getErrorList();

	if(_error.equals("")){

		if(!KSMpiIspBean.socketCommon(_sendData)){
			status = KSMpiIspBean.argGetStatus();
			if(status == null || status.equals("")){
				_error = "ī�� ������û �� ��ְ� �߻��Ͽ����ϴ�.";
				status = "X";
			}else if(status.equals("O")){
				_error = "ī�� ������ ������ְ� �߻��Ͽ����ϴ�.";
			}
		}else{

			 // ���������� ��������
            stLen = KSMpiIspBean.argGetSTLen();

            // ���������� ��ȣȭ ����
            secureType = KSMpiIspBean.argGetSecureType();

            // ��������
            stVer = KSMpiIspBean.argGetSTVer();

            //�ܸ��� ��ȣ
            stTid = KSMpiIspBean.argGetSTTId();

            // ��ޱ���ڵ�
            goveCode = KSMpiIspBean.argGetGoveCode();

            //�����Ϸù�ȣ
            stsn = KSMpiIspBean.argGetSTSN();

            //������ Ÿ�Ӿƿ�
            timeOut = KSMpiIspBean.argGetMerTimeout();

            //�����ڸ�
            adminName = KSMpiIspBean.argGetAdminName();


            // ���������� van-tr �� ȣ��
            vantr = KSMpiIspBean.argGetVanTr();

            // ���������� Status �� ȣ��  O:���� X:����
            status = KSMpiIspBean.argGetStatus();

            // ���������� �ŷ��Ͻ� �� ȣ��
            authdttm = KSMpiIspBean.argGetAuthDTTM();

            // ���������� ī��������/�����޽���1 �� ȣ��
            msg1 = KSMpiIspBean.argGetMsg1();

            // ���������� ���ι�ȣ/�����޽���2 �� ȣ��
            msg2 = KSMpiIspBean.argGetMsg2();

            // ���������� �޽���3 �� ȣ��
            msg3 = KSMpiIspBean.argGetMsg3();

             // ���������� �޽���4 �� ȣ��
            msg4 = KSMpiIspBean.argGetMsg4();


            // ���������� ī���ȣ �� ȣ��
            cardNo = KSMpiIspBean.argGetCardNo();
            if(cardNo != null){
                cardNo = cardNo.substring(0,4)+"-" + cardNo.substring(4,8) + "-" + cardNo.substring(8,12)+" - "+cardNo.substring(12,16);
            }

            // ���������� ���ι�ȣ �� ȣ��
            authno = KSMpiIspBean.argGetAuthNo();

            // ���������� ī������� �� ȣ��
            cardName    = KSMpiIspBean.argGetCardName();

            // ���������� ��ȿ�Ⱓ �� ȣ��
            //expiry = KSMpiIspBean.argGetExpiry();

            //���������� �߱޻��ڵ�
            issue = KSMpiIspBean.argGetIssue();

            //���������� Filler
            KSMpiIspBean.argGetFiller();

            //���������� �Һΰ�����
            installment = KSMpiIspBean.argGetInstallment() ;

            //���������� ���Ի��ڵ�
            acquire = KSMpiIspBean.argGetAcquire() ;

            //������ ��� ID
            merID = KSMpiIspBean.argGetMerID() ;

            //���������� ���۱���
            sendType = KSMpiIspBean.argSendType() ;

            //ȸ����ȭ��ȣ
            adminTel = KSMpiIspBean.argGetAdminTel() ;

            //�޴�����ȣ
            adminMobile = KSMpiIspBean.argGetAdminMobile() ;

             //��������
            GUBUN = KSMpiIspBean.argGetGubun() ;

            //�ѱݾ�
            totAmount = KSMpiIspBean.argGetTotAmount() ;

            //������ ��ȣ
            merNo = KSMpiIspBean.argGetMerNo() ;

            //Notice
            notice = KSMpiIspBean.argGetNotice() ;

            //�߻�����Ʈ
            occurPoint = KSMpiIspBean.argGetOccurPoint() ;

            //��������Ʈ
            usablePoint = KSMpiIspBean.argGetUsablePoint() ;

            //��������Ʈ
            accuPoint = KSMpiIspBean.argGetAccuPoint() ;

            //����Ʈ ī�� �޼���
            pointMsg = KSMpiIspBean.argGetPointMsg() ;

		}
	}else{
		status = "X";
	}

/*
	out.println("<br><br>[Server IP : ][" + IP + "]<br>");
	out.println("[Send Data : ]<br>");
	out.println("["+_sendData+"]<br>");
    out.println("[�������� : ]");
    out.println("["+stLen+"]<br>");
    out.println("[��ȣȭ ���� : ]");
    out.println("["+secureType+"]<br>");
    out.println("[�������� : ]");
    out.println("["+stVer+"]<br>");
    out.println("[�ܸ����ȣ : ]");
    out.println("["+stTid+"]<br>");
    out.println("[��ޱ���ڵ� : ]");
    out.println("["+goveCode+"]<br>");
    out.println("[�����Ϸù�ȣ : ]");
    out.println("["+stsn+"]<br>");
    out.println("[Ÿ�Ӿƿ� : ]");
    out.println("["+timeOut+"]<br>");
    out.println("[�����ڸ� : ]");
    out.println("["+adminName+"]<br>");
    out.println("[ȸ����ȭ��ȣ : ]");
    out.println("["+adminTel+"]<br>");
    out.println("[�޴�����ȣ : ]");
    out.println("["+adminMobile+"]<br>");
    out.println("-----------------------<br>");
    out.println("[�������� : ]");
    out.println("["+GUBUN+"]<br>");
    out.println("[VAN TR : ]");
    out.println("["+vantr+"]<br>");
    out.println("[status : ]");
    out.println("["+status+"]<br>");
    out.println("[�ŷ��Ͻ� : ]");
    out.println("["+authdttm+"]<br>");
    out.println("[ī���ȣ : ]");
    out.println("["+cardNo+"]<br>");
    out.println("[�Һΰ��� : ]");
    out.println("["+installment+"]<br>");
    out.println("[�ѱݾ� : ]");
    out.println("["+totAmount+"]<br>");
    out.println("[message 1 : ]");
    out.println("["+msg1+"]<br>");
    out.println("[message 2 : ]");
    out.println("["+msg2+"]<br>");
    out.println("[message 3 : ]");
    out.println("["+msg3+"]<br>");
    out.println("[message 4 : ]");
    out.println("["+msg4+"]<br>");
    out.println("[���ι�ȣ : ]");
    out.println("["+authno+"]<br>");
    out.println("[ī��� : ]");
    out.println("["+cardName+"]<br>");
    out.println("[�߱޻��ڵ� : ]");
    out.println("["+issue+"]<br>");
    out.println("[���Ի��ڵ� : ]");
    out.println("["+acquire+"]<br>");
    out.println("[������ ��ȣ : ]");
    out.println("["+merNo+"]<br>");
    out.println("[���۱��� : ]");
    out.println("["+sendType+"]<br>");
    out.println("[Notice : ]");
    out.println("["+notice+"]<br>");
    out.println("[�߻�����Ʈ : ]");
    out.println("["+occurPoint+"]<br>");
    out.println("[��������Ʈ : ]");
    out.println("["+usablePoint+"]<br>");
    out.println("[��������Ʈ : ]");
    out.println("["+accuPoint+"]<br>");
    out.println("[����Ʈī��޼��� : ]");
    out.println("["+pointMsg+"]<br>");
    out.println("[������ ID : ]");
    out.println("["+merID+"]<br>");
    out.println("[������ ����ʵ� : ]");
    out.println("["+merUse+"]");
*/

	//TrustForm ó��.
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	String msg = "";
	if(_error.equals(""))
		msg = new StringBuffer().append("�ٽ� �õ��� �ּ���.\n").append(msg1).append(msg2).append(msg3).append(msg4).toString().trim();
	else
		msg = _error + "\n�ٽ� �õ��� �ּ���.";
		
	rxw.add(resTemp, "status", status);
	rxw.add(resTemp, "accflag", request.getParameter("accflag"));
	rxw.add(resTemp, "msg", msg);
	
	rxw.flush(out);
%>
