<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명   : ss_ca_1230_l.jsp
* 기능     : 사이버센터-사이버수당지급-DOWNLOAD
* 작성일자 : 2005-07-21
* 작성자   : 김상옥
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자   :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
    //request parameter
    String closyymm = request.getParameter("closyymm");

    //dataset 인스턴스 선언부분
    SS_P_CYBALON_STAFPAYDataSet ds = (SS_P_CYBALON_STAFPAYDataSet)request.getAttribute("ds");

    //검색 리스트 카운트
    int recCount  =  ds.stafpaylist.size();

    //금액 합
    long totamt   =  0;

    //서버에 임시저장할 파일의 경로및 파일명(경로 + 정산마감년월 + _ + 작업년월일시간)
    Properties  prop     =  new Properties();
	String   srcfilepath =  (String)prop.get("CYB.PATH");

    String  srcfilename  =  closyymm + "_" + Util.getDate() + (Util.getTime()).replaceAll(":","") + ".txt";

    //파일저장 작업
    FileOutputStream   fileout = new FileOutputStream(srcfilepath+srcfilename);
    OutputStreamWriter outstrw = new OutputStreamWriter(fileout); 
    BufferedWriter     buffout = new BufferedWriter(outstrw);


    //[HEADER] SET
    /*
        **** FROMAT TYPE *****
        NUMBER(2)      --구분            DEFAULT : 11
        VARCHAR2(6)    --회사            DEFAULT : 994CHO
        NUMBER(4)      --암호            DEFAULT : 6109
        VARCHAR2(5)    --공백            DEFAULT : SPACE
        NUMBER(2)      --은행코드1       DEFAULT : 21
        NUMBER(3)      --은행코드2       DEFAULT : 994
        VARCHAR2(1)    --공백            DEFAULT : 0
        VARCHAR2(6)    --DOWNLOAD일자    DEFAULT : DOWNLOAD 현재작업일자
        VARCHAR2(20)   --업무명          DEFAULT : 사이버센터장수당
    */

    buffout.write("11994CHO6109     219940" + (Util.getDate()).substring(2,8) + " 사이버센터장수당");
    buffout.newLine();


    //데이타 반복수행하면서 임시파일로 저장
    //[BODY] SET
    /*
        **** FROMAT TYPE *****
        NUMBER(2)      --구분            DEFAULT : 22
        VARCHAR2(6)    --공백            DEFAULT : SPACE
        NUMBER(6)      --입력순서        DEFAULT : 순번
        VARCHAR2(16)   --공백            DEFAULT : SPACE
        VARCHAR2(1)    --공백            DEFAULT : SPACE
        VARCHAR2(15)   --계좌번호        DEFAULT : 계좌번호
        NUMBER(11)     --금액            DEFAULT : 금액
    */

    //숫자형 form
    DecimalFormat dform6  = new DecimalFormat("000000");
    DecimalFormat dform7  = new DecimalFormat("0000000");
    DecimalFormat dform11 = new DecimalFormat("00000000000");
    DecimalFormat dform16 = new DecimalFormat("0000000000000000");

    for(int i=0; i<ds.stafpaylist.size(); i++){
        SS_P_CYBALON_STAFPAYSTAFPAYLISTRecord stafpaylistRec = (SS_P_CYBALON_STAFPAYSTAFPAYLISTRecord)ds.stafpaylist.get(i);

        buffout.write("22");
        buffout.write("      ");
        buffout.write(dform6.format(stafpaylistRec.rnum));
        buffout.write("                ");
        buffout.write(" ");
        buffout.write(Util.getCutStr(Util.getChainStr(stafpaylistRec.acctno,"          ","          ",""),15));
        buffout.write(dform11.format(stafpaylistRec.payalonamt));
        buffout.newLine();

        //금액 합
        totamt  =  totamt + stafpaylistRec.payalonamt;
    }


    //[TAIL] SET
    /*
        **** FROMAT TYPE *****
        NUMBER(2)      --구분            DEFAULT : 33
        VARCHAR2(6)    --공백            DEFAULT : SPACE
        NUMBER(7)      --건수            DEFAULT : 건수
        NUMBER(16)     --금액            DEFAULT : 금액
        VARCHAR2(49)   --공백            DEFAULT : SPACE
    */

    buffout.write("33");
    buffout.write("      ");
    buffout.write(dform7.format(recCount));
    buffout.write(dform16.format(totamt));

    //파일작업을 위한 선언부 close
    buffout.flush();
    buffout.close();
    
    buffout.close();
    fileout.close();

    //client 저장작업
    InputStream     inpstm          =   null;
    OutputStream    outstm          =   null;

    //copy 저장할 임시파일의 경로및 파일명
    File    srcfile   =   new File(srcfilepath+srcfilename);
    inpstm            =   new FileInputStream(srcfile);

    //user가 저장할 파일명
    String  tarfile = new String(srcfilename.getBytes("KSC5601"),"8859_1");

    //저장 대화창 pop
    response.reset();
    response.setContentType("application/smnet");
    response.setHeader("Content-Disposition", "attachment;filename=" + tarfile + ";");
    response.setHeader("Content-Length" , "" + srcfile.length());

    //파일 저장
    outstm          =   response.getOutputStream();
    byte    b[]     =   new byte[(int)srcfile.length()];
    int     leng    =   0;

    while((leng = inpstm.read(b)) > 0) {
        outstm.write(b,0,leng);
    }

    //선언부 close
    inpstm.close();
    outstm.close();

    //server 임시파일 삭제
    if(srcfile.exists() ) srcfile.delete();

%>

<script>
    var lo_form1  =  parent.document.update_form;

    //화면 초기화
    parent.jsInit();
</script>
