<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_common_1106_l.jsp
* ��� : ��������-�Ź�������ǰ-���-�����ڵ�,�ڵ�� ��� ��������
* �ۼ����� : 2003-11-20
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� : �ż��� �����ڵ�, ������ ��� �ݿ�
* ������ : ��뼷
* �������� : 2004-02-17
* ������ϸ� : ss_common_1106_l.jsp.backup.20040217
* �������� : SiteMinder  �������� ���� ����� ������  ���������ڵ�, ���������� ��� ȭ�� �ݿ�
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_JIYEOGCDDataSet ds = (SS_L_JIYEOGCDDataSet)request.getAttribute("ds");
    String applySessionStr = (String)request.getParameter("applySession");
%>

<select id=accd_areacd_id name="areacd" class="sel_all">
<%if("true".equals(applySessionStr)){
	
	// session�� �����ڵ�, ������ ������� <option>�� �����Ѵ�.

	String areanm = (String)session.getAttribute("areanm");
	ArrayList areanmList = getTokens(areanm, "^");		// ������ "^"
	
	
	if(areanmList.size() == 0){	// �����ڵ�,������ ������ ����.
		// �����ڵ�,�������� �������� ����. ����ó��
	}else if(areanmList.size() == 1){	// �����ڵ�,������ ������ �ϳ�.
	
		String areacdnm = (String)areanmList.get(0);
		ArrayList areacdnmList = getTokens(areacdnm, "|");	// ������ "|"
		if(areacdnmList.size() == 2){
			out.println("<option value='"+areacdnmList.get(0)+"'>"+areacdnmList.get(1)+"</option>");
		}else{
			// �����ڵ�, ������ ���� ���� ����. ����ó��.
		}
	}else{	// �����ڵ�,������ ������ ������.
	
		for(int i=0; i<areanmList.size(); i++){
			String areacdnm = (String)areanmList.get(i);
			ArrayList areacdnmList = getTokens(areacdnm, "|");	// ������ "|"
			
			if(areacdnmList.size() == 2){
			
				// SS_L_JIYEOGCDDataSet ��ü�� curcommlist�� ���Ե� SS_L_JIYEOGCDCURCOMMLISTRecord ��ü�� areacd�� ���Ͽ� ������ �����ڵ� ��Ͽ� �����ϴ� �׸� ����Ѵ�.
				for(int j=0; j<ds.curcommlist.size(); j++){
					SS_L_JIYEOGCDCURCOMMLISTRecord record = (SS_L_JIYEOGCDCURCOMMLISTRecord)ds.curcommlist.get(j);
					
					if(areacdnmList.get(0).equals(record.areacd)){
						out.println("<option value='"+areacdnmList.get(0)+"'>"+areacdnmList.get(1)+"</option>");
					}
				}				
				
			}else{
				// �����ڵ�, ������ ���� ���� ����. ����ó��
			}
		}
	}		
	
}else{%>
    <%= ds.curcommlistOptHtml("") %><!-- �����ڵ�, �ڵ�� ��� -->
<%}%>

</select>

<script>
    parent.document.all.accd_areacd_id.outerHTML = accd_areacd_id.outerHTML;
</script>
