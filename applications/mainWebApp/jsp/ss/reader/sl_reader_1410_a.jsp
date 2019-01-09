<%@ page contentType="text/xml; charset=euc-kr" %>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common_x.jsp"%>

<%---------------------------------------------------------------------------------------------------
* 파일명	: sl_reader_1410_a.jsp
* 기능		: 독자-독자정보관리-이체신청팝업-카드인증
* 작성일자	: 2004-05-26
* 작성자	: 김상열

* 수정내역	:
* 수정자	:
* 수정일자 	:
* 백업파일명:
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-04-08
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>



<jsp:useBean id="KSMpiIspBean" class="com.ksnet.card.KSMpiIspBean" scope="page"></jsp:useBean>
<%
	/*
        JSP Name : CertifyReq.jsp

        최초 작성일자 : 2004/05/19
        최초 작성자   : 김찬
        최종 수정일자 :
        최종 수정자   :
        */

	//String	IP		= "210.181.29.11";
	String	IP		= "210.181.28.137";
	int		PORT	= 7131;

	String GUBUN 	= "1110";   		//	인증요청 전문구분
	String posMode 	= "K";    			//	Pos Entry Mode 초기화  K : key-IN S:Swipe
	String goveCode = "11111";    		//	취급기관코드

	String tid		= "DPT0006501";		//	Test 단말기 번호 - 향후 단말기 번호 변경 요망
	String secType	= "1";				//	암호화 안함
	String  _sendData   = "";
	String sendType = "1";				//	카드정보전송구분 1:응답시 카드정보 전송 요망
	String cardName	= "";

	String cardNo	= ""; // 카드번호
	String expiry	= ""; // 유효년월( YYMM )
	String juminNo	= ""; // 주민번호 뒷자리 (7자리)

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
		throw new Exception("데이타에 NULL값이 존재합니다.다시 입력해 주세요.");
	}

	// 초기 환경 세팅함수 (IP / PORT )
	KSMpiIspBean.argSetInitConf(IP,PORT);

	// 초기 로그 환경 세팅함수 (로깅디렉토리 / 에러로깅디렉토리)
	KSMpiIspBean.argSetInitLog("/was/salesdept/log/ksnet/log","Y","/was/salesdept/log/ksnet/errlog","Y");

	// 암호화 구분필드 0:암호화 안함 2:함
	KSMpiIspBean.argSetSecureType(secType);

	// 단말기 번호 초기화
	KSMpiIspBean.argSetTermId(tid);

	// 취급기관코드 초기화
	KSMpiIspBean.argSetGoveCode(goveCode);

	// 승인구분 초기화
	KSMpiIspBean.argSetAuthGubun(GUBUN);

	// Pos Entry Mode 초기화  K : key-IN S:Swipe
	KSMpiIspBean.argSetPosEntMode(posMode);

	// 카드번호 초기화
	KSMpiIspBean.argSetCardno(cardNo);

	// 유효년월 초기화
	KSMpiIspBean.argSetExpiry(expiry);

	// 주민번호 초기화
	KSMpiIspBean.argSetJuminNBuss(juminNo);

	// 공인인증구분
	KSMpiIspBean.argSetCertiGubun(" ");

	// 카드정보 전송구분
	KSMpiIspBean.argSetSendInfo(sendType);

	// 승인요청 전문 생성,전송 및 응답수신
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
				_error = "카드 인증요청 중 장애가 발생하였습니다.";
				status = "X";
			}else if(status.equals("O")){
				_error = "카드 인증후 내부장애가 발생하였습니다.";
			}
		}else{

			 // 응답전문의 전문길이
            stLen = KSMpiIspBean.argGetSTLen();

            // 응답전문의 암호화 구분
            secureType = KSMpiIspBean.argGetSecureType();

            // 전문버젼
            stVer = KSMpiIspBean.argGetSTVer();

            //단말기 번호
            stTid = KSMpiIspBean.argGetSTTId();

            // 취급기관코드
            goveCode = KSMpiIspBean.argGetGoveCode();

            //전문일련번호
            stsn = KSMpiIspBean.argGetSTSN();

            //가맹점 타임아웃
            timeOut = KSMpiIspBean.argGetMerTimeout();

            //관리자명
            adminName = KSMpiIspBean.argGetAdminName();


            // 응답전문중 van-tr 값 호출
            vantr = KSMpiIspBean.argGetVanTr();

            // 응답전문중 Status 값 호출  O:정상 X:거절
            status = KSMpiIspBean.argGetStatus();

            // 응답전문중 거래일시 값 호출
            authdttm = KSMpiIspBean.argGetAuthDTTM();

            // 응답전문중 카드종류명/거절메시지1 값 호출
            msg1 = KSMpiIspBean.argGetMsg1();

            // 응답전문중 승인번호/거절메시지2 값 호출
            msg2 = KSMpiIspBean.argGetMsg2();

            // 응답전문중 메시지3 값 호출
            msg3 = KSMpiIspBean.argGetMsg3();

             // 응답전문중 메시지4 값 호출
            msg4 = KSMpiIspBean.argGetMsg4();


            // 응답전문중 카드번호 값 호출
            cardNo = KSMpiIspBean.argGetCardNo();
            if(cardNo != null){
                cardNo = cardNo.substring(0,4)+"-" + cardNo.substring(4,8) + "-" + cardNo.substring(8,12)+" - "+cardNo.substring(12,16);
            }

            // 응답전문중 승인번호 값 호출
            authno = KSMpiIspBean.argGetAuthNo();

            // 응답전문중 카드종료명 값 호출
            cardName    = KSMpiIspBean.argGetCardName();

            // 응답전문중 유효기간 값 호출
            //expiry = KSMpiIspBean.argGetExpiry();

            //응답전문의 발급사코드
            issue = KSMpiIspBean.argGetIssue();

            //응답전문의 Filler
            KSMpiIspBean.argGetFiller();

            //응답전문의 할부개월수
            installment = KSMpiIspBean.argGetInstallment() ;

            //응답전문의 매입사코드
            acquire = KSMpiIspBean.argGetAcquire() ;

            //가맹점 사용 ID
            merID = KSMpiIspBean.argGetMerID() ;

            //응답전문의 전송구분
            sendType = KSMpiIspBean.argSendType() ;

            //회사전화번호
            adminTel = KSMpiIspBean.argGetAdminTel() ;

            //휴대폰번호
            adminMobile = KSMpiIspBean.argGetAdminMobile() ;

             //전문구분
            GUBUN = KSMpiIspBean.argGetGubun() ;

            //총금액
            totAmount = KSMpiIspBean.argGetTotAmount() ;

            //가맹점 번호
            merNo = KSMpiIspBean.argGetMerNo() ;

            //Notice
            notice = KSMpiIspBean.argGetNotice() ;

            //발생포인트
            occurPoint = KSMpiIspBean.argGetOccurPoint() ;

            //가용포인트
            usablePoint = KSMpiIspBean.argGetUsablePoint() ;

            //누적포인트
            accuPoint = KSMpiIspBean.argGetAccuPoint() ;

            //포인트 카드 메세지
            pointMsg = KSMpiIspBean.argGetPointMsg() ;

		}
	}else{
		status = "X";
	}

/*
	out.println("<br><br>[Server IP : ][" + IP + "]<br>");
	out.println("[Send Data : ]<br>");
	out.println("["+_sendData+"]<br>");
    out.println("[전문길이 : ]");
    out.println("["+stLen+"]<br>");
    out.println("[암호화 구분 : ]");
    out.println("["+secureType+"]<br>");
    out.println("[전문버젼 : ]");
    out.println("["+stVer+"]<br>");
    out.println("[단말기번호 : ]");
    out.println("["+stTid+"]<br>");
    out.println("[취급기관코드 : ]");
    out.println("["+goveCode+"]<br>");
    out.println("[전문일련번호 : ]");
    out.println("["+stsn+"]<br>");
    out.println("[타임아웃 : ]");
    out.println("["+timeOut+"]<br>");
    out.println("[관리자명 : ]");
    out.println("["+adminName+"]<br>");
    out.println("[회사전화번호 : ]");
    out.println("["+adminTel+"]<br>");
    out.println("[휴대폰번호 : ]");
    out.println("["+adminMobile+"]<br>");
    out.println("-----------------------<br>");
    out.println("[전문구분 : ]");
    out.println("["+GUBUN+"]<br>");
    out.println("[VAN TR : ]");
    out.println("["+vantr+"]<br>");
    out.println("[status : ]");
    out.println("["+status+"]<br>");
    out.println("[거래일시 : ]");
    out.println("["+authdttm+"]<br>");
    out.println("[카드번호 : ]");
    out.println("["+cardNo+"]<br>");
    out.println("[할부개월 : ]");
    out.println("["+installment+"]<br>");
    out.println("[총금액 : ]");
    out.println("["+totAmount+"]<br>");
    out.println("[message 1 : ]");
    out.println("["+msg1+"]<br>");
    out.println("[message 2 : ]");
    out.println("["+msg2+"]<br>");
    out.println("[message 3 : ]");
    out.println("["+msg3+"]<br>");
    out.println("[message 4 : ]");
    out.println("["+msg4+"]<br>");
    out.println("[승인번호 : ]");
    out.println("["+authno+"]<br>");
    out.println("[카드명 : ]");
    out.println("["+cardName+"]<br>");
    out.println("[발급사코드 : ]");
    out.println("["+issue+"]<br>");
    out.println("[매입사코드 : ]");
    out.println("["+acquire+"]<br>");
    out.println("[가맹점 번호 : ]");
    out.println("["+merNo+"]<br>");
    out.println("[전송구분 : ]");
    out.println("["+sendType+"]<br>");
    out.println("[Notice : ]");
    out.println("["+notice+"]<br>");
    out.println("[발생포인트 : ]");
    out.println("["+occurPoint+"]<br>");
    out.println("[가용포인트 : ]");
    out.println("["+usablePoint+"]<br>");
    out.println("[누적포인트 : ]");
    out.println("["+accuPoint+"]<br>");
    out.println("[포인트카드메세지 : ]");
    out.println("["+pointMsg+"]<br>");
    out.println("[가맹점 ID : ]");
    out.println("["+merID+"]<br>");
    out.println("[가맹점 사용필드 : ]");
    out.println("["+merUse+"]");
*/

	//TrustForm 처리.
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	String msg = "";
	if(_error.equals(""))
		msg = new StringBuffer().append("다시 시도해 주세요.\n").append(msg1).append(msg2).append(msg3).append(msg4).toString().trim();
	else
		msg = _error + "\n다시 시도해 주세요.";
		
	rxw.add(resTemp, "status", status);
	rxw.add(resTemp, "accflag", request.getParameter("accflag"));
	rxw.add(resTemp, "msg", msg);
	
	rxw.flush(out);
%>
