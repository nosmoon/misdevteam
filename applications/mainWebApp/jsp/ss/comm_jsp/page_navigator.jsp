<%@ page contentType="text/html; charset=KSC5601" %>
<!--JSP COMMENT START------------------------------------------------------------------------------->
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : page_navigator.jsp
* ��� 	: ������ �׺������
* 		 Ư����� - Paging Set Size �� 10 ���� �����Ǿ� ����
*		 ���ǻ��� - ó��.����,����,������ ��ũ�� �ɸ��� �̹��� file�� URL �� ���� ����� �����θ� �̿��� ��.
*			- �׺�����͸� include �ϴ� jsp ���������� hidden form �� �׿� �����ϴ� javascript �Լ��� �־����.
*			- javascript �Լ��� signature �� �ݵ��  function xxxxxx(pageno) �̾�� ��.
* �ۼ����� : 2003-11-03
* �ۼ��� : �迵��
---------------------------------------------------------------------------------------------------%>
<!--JSP COMMENT END--------------------------------------------------------------------------------->
<%
    // request variables (�ʼ��׸�)
    int pageno; 		// ���� ������ ��ȣ (default : 1)
    int totalcnt;		// �� ���ڵ� ��			(default : 0)
    String js_fn_nm; 		// �ڹٽ�ũ��Ʈ �Լ��� (default : "")

    pageno 	= (request.getParameter("pageno") == null)? 1 : Integer.parseInt(request.getParameter("pageno")); // ���� ������ ��ȣ
    totalcnt = (request.getParameter("totalcnt") == null)? 0 : Integer.parseInt(request.getParameter("totalcnt"));; // �� ���ڵ� ��
    js_fn_nm = (request.getParameter("js_fn_nm") == null)? "" : request.getParameter("js_fn_nm"); // �̹����� ������ �� ��ȣ ��ũ�� ����� �ڹٽ�ũ��Ʈ �Լ���

    // request variables (�ɼ��׸�)
    int pagesize;	// �������� ���ڵ� �� (default : 10)
    int page_set_gubun;					// ó��,����,����,������ �̹��� ���̿� " 1 2 3 4 5 6 7 8 9 10 " ������ ���� ���� �� ( 0 : ������ , 1 : �� ������ ) (default : 0)

    pagesize 	= (request.getParameter("pagesize") == null)? 10 : Integer.parseInt(request.getParameter("pagesize")); //�� �������� ���ڵ�� default �� 10
    page_set_gubun 		= (request.getParameter("page_set_gubun") == null)? 0 : Integer.parseInt(request.getParameter("page_set_gubun")); // ������ �� ���÷��� ����

    //local variables
    int total_pages 	= (int)Math.ceil((double)totalcnt /pagesize) ;  // �� ������ ��


    if(pageno > 1 && totalcnt > 0){
	  	out.write("\n<input type=\"image\" id=\"first_page_btn\" src=\"/html/comm_img/bu_first01.gif\" alt=\"ó�� ��������\" border=\"0\" align=\"absmiddle\" onclick=\""+js_fn_nm+"(1);window.event.returnValue=false;\">");
    } else {
		out.write("\n<input type=\"image\" id=\"first_page_btn\" src=\"/html/comm_img/bu_first01.gif\" alt=\"ó�� ��������\" border=\"0\" align=\"absmiddle\" onclick=\"window.event.returnValue=false;\">");
    }

    if( pageno > 1 && totalcnt > 0){
		out.write("\n<input type=\"image\" id=\"prev_page_btn\" src=\"/html/comm_img/bu_prev01.gif\" alt=\"���� ��������\" border=\"0\" align=\"absmiddle\" onclick=\""+js_fn_nm+"("+ (pageno - 1) +");window.event.returnValue=false;\">");
    }else{
		out.write("\n<input type=\"image\" id=\"prev_page_btn\" src=\"/html/comm_img/bu_prev01.gif\" alt=\"���� ��������\" align=\"absmiddle\" onclick=\"window.event.returnValue=false;\">");
    }

    int cnt =0;
    int pageSetIdx = ((int)Math.ceil((double)pageno / 10))*10 - 9;

    if (totalcnt > 0 && page_set_gubun == 0){
        for(int i = pageSetIdx ; i <= total_pages ; i++){
            if( i == pageno ){
				out.write ("<b><font color=\"#FF6600\" style='font-size:13;'>"+i+"</font></b>&nbsp;");
            }else{
				out.write ("<span style='font-size:13;cursor:hand' onclick=\""+js_fn_nm+"("+ i +");\" >"+i+"</span>&nbsp;");
            }

            if(++cnt == 10) break;
        }
    }

    if(totalcnt > 0 && pageno < total_pages){
		out.write("\n<input type=\"image\" id=\"next_page_btn\" src=\"/html/comm_img/bu_next01.gif\" alt=\"���� ��������\" border=\"0\" align=\"absmiddle\" onclick=\""+js_fn_nm+"("+ (pageno + 1)+");window.event.returnValue=false;\">");
    }else{
		out.write("\n<input type=\"image\" id=\"next_page_btn\" src=\"/html/comm_img/bu_next01.gif\" alt=\"���� ��������\" border=\"0\" align=\"absmiddle\" onclick=\"window.event.returnValue=false;\">");
    }
    if(totalcnt > 0 && pageno < total_pages ){
		out.write("\n<input type=\"image\" id=\"last_page_btn\" src=\"/html/comm_img/bu_end01.gif\" border=\"0\" alt=\"������ ��������\" align=\"absmiddle\" onclick=\""+js_fn_nm+"("+total_pages+");window.event.returnValue=false;\">");
    }else{
		out.write("\n<input type=\"image\" id=\"last_page_btn\" src=\"/html/comm_img/bu_end01.gif\" border=\"0\" alt=\"������ ��������\" align=\"absmiddle\" onclick=\"window.event.returnValue=false;\">");
    }

%>