<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%@ page import="java.util.*,java.io.*,java.sql.*,jxl.*" %>
<%@ page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy" %>
<%@ page import="com.oreilly.servlet.MultipartRequest"%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�   : ps_send_2141_p.jsp
* ���     : �ݼ۰��� excel ���ε� pop
* �ۼ����� : 2008-07-10
* �ۼ���   : ������
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ���� ������ ����.
* ������ : ������
* �������� : 2009-03-10
* ������ϸ� : ps_send_2141_p.jsp_org
---------------------------------------------------------------------------------------------------%>
<% 
	String path=request.getRealPath("/upload/");    //���ε�Ǵ� ��ġ ����
    int sizeLimit = 2*1024*1024;                    //���Ͽ뷮����
    boolean rdrChk = true;

    //������ ������Ʈ ����(������ ���ϸ��� ���� ��ü, �������� ������, ���Ͽ뷮����, �����ڵ�, �⺻���� ����)
    MultipartRequest multi = new MultipartRequest(request, path, sizeLimit, "8859_1", new DefaultFileRenamePolicy());
    Enumeration formNames = multi.getFileNames();       //�������� ����
    String formName1 = (String)formNames.nextElement();
    String fname1 = multi.getFilesystemName(formName1);
    Workbook workbook = Workbook.getWorkbook(new File(path+"/"+fname1));
    Sheet sheet = workbook.getSheet(0);

    int col = sheet.getColumns();
    int row = sheet.getRows();
        
    // ���������� ����    
    RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID; 
	int acctTemp = rxw.makeParentNode(root, "dataTemp");
	
	//record ��ü�� �״�� ����� �� ���� ������ �ʿ��ϹǷ� makeDataToBulk�� ������� �ʰ� �Ʒ��� ���� ó��.	
    
    //������ excel ���üũ
    if(col != 2){
    	
    	rxw.setMessageAlert("������ excel ����� �ƴմϴ�.");

    }else{
    	
	    String result[][] = new String[col][row];
	    String f_rdr_no = "";
	    String f_retn_nmno = "";
	    Cell cell;
	
	    int i=0;
	    int j=0;
	    int total_cnt=0;
	
	    for(i=0; i<row; i++){
	        for(j=0; j<col; j++){
	            cell = sheet.getCell(j, i);
	            if(cell.getContents() != null){
	                result[j][i] = cell.getContents();
	            }else{
	                result[j][i] = "";
	            }
	        }
	    }
	    
	    rxw.makeHugeStart(acctTemp, "uploadGrid");
	    for(total_cnt=0; total_cnt<row; total_cnt++){

	    	//title �߰�.
			if(total_cnt == 0)
			{
				rxw.add_ColVal("check");
				rxw.add_ColVal("sepr_retndt");
				rxw.add_ColVal("sepr_rdr_no");
				rxw.add_ColVal("sepr_medicd");
				rxw.add_ColVal("sepr_termsubsno");
				rxw.add_ColVal("sepr_rdr_detail");
				rxw.add_ColVal("sepr_retnresncd");
				rxw.add_ColVal("sepr_retnclsf");
				rxw.add_ColVal("sepr_retnclsf_detail");
				rxw.add_ColVal("sepr_retn_nmno");
				rxw.add_ColVal("sepr_boprocyn");
				rxw.add_RowVal("sepr_boprocyn_detail");
				//������ �ʵ�� �ڵ� ����.
				//rxw.makeRecordToBulkTitle(row);
			}

			//������ �߰�.
			rxw.add_ColVal("Y");
			rxw.add_ColVal(Util.getDate());
			rxw.add_ColVal(result[0][total_cnt].substring(0,9));
			rxw.add_ColVal(result[0][total_cnt].substring(10,13));
			rxw.add_ColVal(result[0][total_cnt].substring(14,18));
			rxw.add_ColVal(result[0][total_cnt].substring(0,18));
			rxw.add_ColVal(result[1][total_cnt]);
			rxw.add_ColVal("01");
			rxw.add_ColVal("��ü");
			rxw.add_ColVal(result[0][total_cnt].substring(19,23));
			rxw.add_ColVal("N");
			rxw.add_RowVal("�̰�");
			//rxw.add_ColVal(new StringBuffer().append(curcommlistRec.dlvaddr).append(" ").append(curcommlistRec.dlvdtlsaddr));
			//������ �ʵ� �ڵ�����.
			//rxw.makeRecordToBulk(row, false);	    	
	    }	    
	    rxw.makeHugeEnd();		
    
	    rxw.add(acctTemp, "totalCount", total_cnt);	    
	    rxw.flush(out);
    }
    
    File file = new File(path + "/" + fname1);
    file.delete();
%>
