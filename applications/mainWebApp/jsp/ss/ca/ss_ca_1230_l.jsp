<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�   : ss_ca_1230_l.jsp
* ���     : ���̹�����-���̹���������-DOWNLOAD
* �ۼ����� : 2005-07-21
* �ۼ���   : ����
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������   :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    //request parameter
    String closyymm = request.getParameter("closyymm");

    //dataset �ν��Ͻ� ����κ�
    SS_P_CYBALON_STAFPAYDataSet ds = (SS_P_CYBALON_STAFPAYDataSet)request.getAttribute("ds");

    //�˻� ����Ʈ ī��Ʈ
    int recCount  =  ds.stafpaylist.size();

    //�ݾ� ��
    long totamt   =  0;

    //������ �ӽ������� ������ ��ι� ���ϸ�(��� + ���긶����� + _ + �۾�����Ͻð�)
    Properties  prop     =  new Properties();
	String   srcfilepath =  (String)prop.get("CYB.PATH");

    String  srcfilename  =  closyymm + "_" + Util.getDate() + (Util.getTime()).replaceAll(":","") + ".txt";

    //�������� �۾�
    FileOutputStream   fileout = new FileOutputStream(srcfilepath+srcfilename);
    OutputStreamWriter outstrw = new OutputStreamWriter(fileout); 
    BufferedWriter     buffout = new BufferedWriter(outstrw);


    //[HEADER] SET
    /*
        **** FROMAT TYPE *****
        NUMBER(2)      --����            DEFAULT : 11
        VARCHAR2(6)    --ȸ��            DEFAULT : 994CHO
        NUMBER(4)      --��ȣ            DEFAULT : 6109
        VARCHAR2(5)    --����            DEFAULT : SPACE
        NUMBER(2)      --�����ڵ�1       DEFAULT : 21
        NUMBER(3)      --�����ڵ�2       DEFAULT : 994
        VARCHAR2(1)    --����            DEFAULT : 0
        VARCHAR2(6)    --DOWNLOAD����    DEFAULT : DOWNLOAD �����۾�����
        VARCHAR2(20)   --������          DEFAULT : ���̹����������
    */

    buffout.write("11994CHO6109     219940" + (Util.getDate()).substring(2,8) + " ���̹����������");
    buffout.newLine();


    //����Ÿ �ݺ������ϸ鼭 �ӽ����Ϸ� ����
    //[BODY] SET
    /*
        **** FROMAT TYPE *****
        NUMBER(2)      --����            DEFAULT : 22
        VARCHAR2(6)    --����            DEFAULT : SPACE
        NUMBER(6)      --�Է¼���        DEFAULT : ����
        VARCHAR2(16)   --����            DEFAULT : SPACE
        VARCHAR2(1)    --����            DEFAULT : SPACE
        VARCHAR2(15)   --���¹�ȣ        DEFAULT : ���¹�ȣ
        NUMBER(11)     --�ݾ�            DEFAULT : �ݾ�
    */

    //������ form
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

        //�ݾ� ��
        totamt  =  totamt + stafpaylistRec.payalonamt;
    }


    //[TAIL] SET
    /*
        **** FROMAT TYPE *****
        NUMBER(2)      --����            DEFAULT : 33
        VARCHAR2(6)    --����            DEFAULT : SPACE
        NUMBER(7)      --�Ǽ�            DEFAULT : �Ǽ�
        NUMBER(16)     --�ݾ�            DEFAULT : �ݾ�
        VARCHAR2(49)   --����            DEFAULT : SPACE
    */

    buffout.write("33");
    buffout.write("      ");
    buffout.write(dform7.format(recCount));
    buffout.write(dform16.format(totamt));

    //�����۾��� ���� ����� close
    buffout.flush();
    buffout.close();
    
    buffout.close();
    fileout.close();

    //client �����۾�
    InputStream     inpstm          =   null;
    OutputStream    outstm          =   null;

    //copy ������ �ӽ������� ��ι� ���ϸ�
    File    srcfile   =   new File(srcfilepath+srcfilename);
    inpstm            =   new FileInputStream(srcfile);

    //user�� ������ ���ϸ�
    String  tarfile = new String(srcfilename.getBytes("KSC5601"),"8859_1");

    //���� ��ȭâ pop
    response.reset();
    response.setContentType("application/smnet");
    response.setHeader("Content-Disposition", "attachment;filename=" + tarfile + ";");
    response.setHeader("Content-Length" , "" + srcfile.length());

    //���� ����
    outstm          =   response.getOutputStream();
    byte    b[]     =   new byte[(int)srcfile.length()];
    int     leng    =   0;

    while((leng = inpstm.read(b)) > 0) {
        outstm.write(b,0,leng);
    }

    //����� close
    inpstm.close();
    outstm.close();

    //server �ӽ����� ����
    if(srcfile.exists() ) srcfile.delete();

%>

<script>
    var lo_form1  =  parent.document.update_form;

    //ȭ�� �ʱ�ȭ
    parent.jsInit();
</script>
