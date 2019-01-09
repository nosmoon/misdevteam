<%@ page contentType="text/html; charset=EUC_KR" %>
<!--JSP COMMENT START------------------------------------------------------------------------------->
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : page_navigator.jsp
* ��� 	: ������ �׺������
* 		 Ư����� - Paging Set Size �� 10 ���� �����Ǿ� ����
*		 ���ǻ��� - ó��.����,����,������ ��ũ�� �ɸ��� �̹��� file�� URL �� ���� ����� �����θ� �̿��� ��.
*			- �׺�����͸� include �ϴ� jsp ���������� hidden form �� �׿� �����ϴ� javascript �Լ��� �־����.
*			- javascript �Լ��� signature �� �ݵ��  function xxxxxx(page_no) �̾�� ��.
* �ۼ����� : 2003-11-03
* �ۼ��� : �迵��
---------------------------------------------------------------------------------------------------%>
<!--JSP COMMENT END--------------------------------------------------------------------------------->
<%
    // request variables (�ʼ��׸�)
    int curr_page_no; 		// ���� ������ ��ȣ (default : 1)
    int total_records;		// �� ���ڵ� ��			(default : 0)
    String js_fn_nm; 		// �ڹٽ�ũ��Ʈ �Լ��� (default : "")

    curr_page_no 	= (request.getParameter("curr_page_no") == null)? 1 : Integer.parseInt(request.getParameter("curr_page_no")); // ���� ������ ��ȣ
    total_records = (request.getParameter("total_records") == null)? 0 : Integer.parseInt(request.getParameter("total_records"));; // �� ���ڵ� ��
    js_fn_nm = (request.getParameter("js_fn_nm") == null)? "" : request.getParameter("js_fn_nm"); // �̹����� ������ �� ��ȣ ��ũ�� ����� �ڹٽ�ũ��Ʈ �Լ���

    // request variables (�ɼ��׸�)
    int records_per_page;	// �������� ���ڵ� �� (default : 10)
    int page_set_gubun;					// ó��,����,����,������ �̹��� ���̿� " 1 2 3 4 5 6 7 8 9 10 " ������ ���� ���� �� ( 0 : ������ , 1 : �� ������ ) (default : 0)

    records_per_page 	= (request.getParameter("records_per_page") == null)? 10 : Integer.parseInt(request.getParameter("records_per_page")); //�� �������� ���ڵ�� default �� 10
    page_set_gubun 		= (request.getParameter("page_set_gubun") == null)? 0 : Integer.parseInt(request.getParameter("page_set_gubun")); // ������ �� ���÷��� ����

    //local variables
    int total_pages 	= (int)Math.ceil((double)total_records /records_per_page) ;  // �� ������ ��


    if(curr_page_no > 1 && total_records > 0){
    out.write("<a href=\"javascript:"+js_fn_nm+"(1);\"><img src=\"/html/comm_img/bu_first01.gif\" alt=\"ó�� ��������\" border=\"0\" ></a>");
    } else {
        out.write("<img src=\"/html/comm_img/bu_first01.gif\" alt=\"ó�� ��������\" border=\"0\" >");
    }

    if( curr_page_no > 1 && total_records > 0){
        out.write("<a href=\"javascript:"+js_fn_nm+"("+ (curr_page_no - 1) +");\"><img src=\"/html/comm_img/bu_prev01.gif\" alt=\"���� ��������\" border=\"0\"></a>");
    }else{
        out.write("<img src=\"/html/comm_img/bu_prev01.gif\" alt=\"���� ��������\">");
    }

    int cnt =0;
    int pageSetIdx = ((int)Math.ceil((double)curr_page_no / 10))*10 - 9;

    if (total_records > 0 && page_set_gubun == 0){
        for(int i = pageSetIdx ; i <= total_pages ; i++){
            if( i == curr_page_no ){
                out.write ("<b><font color=\"#FF6600\">"+i+"</font></b> ");
            }else{
                out.write ("<a href=\"javascript:"+js_fn_nm+"("+ i +");\">"+i+"</a> ");
            }

            if(++cnt == 10) break;
        }
    }

    if(total_records > 0 && curr_page_no < total_pages){
        out.write("<a href=\"javascript:"+js_fn_nm+"("+ (curr_page_no + 1)+");\"><img src=\"/html/comm_img/bu_next01.gif\" alt=\"���� ��������\" border=\"0\" ></a>");
    }else{
        out.write("<img src=\"/html/comm_img/bu_next01.gif\" alt=\"���� ��������\" border=\"0\" >");
    }
    if(total_records > 0 && curr_page_no < total_pages ){
        out.write("<a href=\"javascript:"+js_fn_nm+"("+total_pages+");\"><img src=\"/html/comm_img/bu_end01.gif\" border=\"0\" alt=\"������ ��������\"></a>");
    }else{
        out.write("<img src=\"/html/comm_img/bu_end01.gif\" border=\"0\" alt=\"������ ��������\" >");
    }

%>