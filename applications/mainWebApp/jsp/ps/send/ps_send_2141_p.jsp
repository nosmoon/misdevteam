<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%@ page import="java.util.*,java.io.*,java.sql.*,jxl.*" %>
<%@ page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy" %>
<%@ page import="com.oreilly.servlet.MultipartRequest"%>
<%---------------------------------------------------------------------------------------------------
* 파일명   : ps_send_2141_p.jsp
* 기능     : 반송관리 excel 업로드 pop
* 작성일자 : 2008-07-10
* 작성자   : 김재일
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응 구조로 변경.
* 수정자 : 권정윤
* 수정일자 : 2009-03-10
* 백업파일명 : ps_send_2141_p.jsp_org
---------------------------------------------------------------------------------------------------%>
<% 
	String path=request.getRealPath("/upload/");    //업로드되는 위치 지정
    int sizeLimit = 2*1024*1024;                    //파일용량제한
    boolean rdrChk = true;

    //전송할 콤포넌트 생성(전송할 파일명을 가진 객체, 서버상의 절대경로, 파일용량제한, 분자코드, 기본보안 적용)
    MultipartRequest multi = new MultipartRequest(request, path, sizeLimit, "8859_1", new DefaultFileRenamePolicy());
    Enumeration formNames = multi.getFileNames();       //파일정보 저장
    String formName1 = (String)formNames.nextElement();
    String fname1 = multi.getFilesystemName(formName1);
    Workbook workbook = Workbook.getWorkbook(new File(path+"/"+fname1));
    Sheet sheet = workbook.getSheet(0);

    int col = sheet.getColumns();
    int row = sheet.getRows();
        
    // 대응구조로 변경    
    RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID; 
	int acctTemp = rxw.makeParentNode(root, "dataTemp");
	
	//record 개체를 그대로 사용할 수 없고 가공이 필요하므로 makeDataToBulk를 사용하지 않고 아래와 같이 처리.	
    
    //지정된 excel 양식체크
    if(col != 2){
    	
    	rxw.setMessageAlert("지정된 excel 양식이 아닙니다.");

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

	    	//title 추가.
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
				//나머지 필드는 자동 생성.
				//rxw.makeRecordToBulkTitle(row);
			}

			//데이터 추가.
			rxw.add_ColVal("Y");
			rxw.add_ColVal(Util.getDate());
			rxw.add_ColVal(result[0][total_cnt].substring(0,9));
			rxw.add_ColVal(result[0][total_cnt].substring(10,13));
			rxw.add_ColVal(result[0][total_cnt].substring(14,18));
			rxw.add_ColVal(result[0][total_cnt].substring(0,18));
			rxw.add_ColVal(result[1][total_cnt]);
			rxw.add_ColVal("01");
			rxw.add_ColVal("매체");
			rxw.add_ColVal(result[0][total_cnt].substring(19,23));
			rxw.add_ColVal("N");
			rxw.add_RowVal("미결");
			//rxw.add_ColVal(new StringBuffer().append(curcommlistRec.dlvaddr).append(" ").append(curcommlistRec.dlvdtlsaddr));
			//나머지 필드 자동생성.
			//rxw.makeRecordToBulk(row, false);	    	
	    }	    
	    rxw.makeHugeEnd();		
    
	    rxw.add(acctTemp, "totalCount", total_cnt);	    
	    rxw.flush(out);
    }
    
    File file = new File(path + "/" + fname1);
    file.delete();
%>
