<%@ page contentType="text/html; charset=EUC_KR" %>
<!--JSP COMMENT START------------------------------------------------------------------------------->
<%---------------------------------------------------------------------------------------------------
* 파일명 : page_navigator.jsp
* 기능 	: 페이지 네비게이터
* 		 특기사항 - Paging Set Size 가 10 으로 고정되어 있음
*		 주의사항 - 처음.이전,다음,마지막 링크가 걸리는 이미지 file의 URL 은 실제 적용시 절대경로를 이용할 것.
*			- 네비게이터를 include 하는 jsp 페이지내에 hidden form 과 그에 상응하는 javascript 함수가 있어야함.
*			- javascript 함수의 signature 는 반드시  function xxxxxx(page_no) 이어야 함.
* 작성일자 : 2003-11-03
* 작성자 : 김영윤
---------------------------------------------------------------------------------------------------%>
<!--JSP COMMENT END--------------------------------------------------------------------------------->
<%
    // request variables (필수항목)
    int curr_page_no; 		// 현재 페이지 번호 (default : 1)
    int total_records;		// 총 레코드 수			(default : 0)
    String js_fn_nm; 		// 자바스크립트 함수명 (default : "")

    curr_page_no 	= (request.getParameter("curr_page_no") == null)? 1 : Integer.parseInt(request.getParameter("curr_page_no")); // 현재 페이지 번호
    total_records = (request.getParameter("total_records") == null)? 0 : Integer.parseInt(request.getParameter("total_records"));; // 총 레코드 수
    js_fn_nm = (request.getParameter("js_fn_nm") == null)? "" : request.getParameter("js_fn_nm"); // 이미지나 페이지 셋 번호 링크에 적용될 자바스크립트 함수명

    // request variables (옵션항목)
    int records_per_page;	// 페이지당 레코드 수 (default : 10)
    int page_set_gubun;					// 처음,이전,다음,마지막 이미지 사이에 " 1 2 3 4 5 6 7 8 9 10 " 페이지 셋을 보여 줌 ( 0 : 보여줌 , 1 : 안 보여줌 ) (default : 0)

    records_per_page 	= (request.getParameter("records_per_page") == null)? 10 : Integer.parseInt(request.getParameter("records_per_page")); //한 페이지당 레코드수 default 값 10
    page_set_gubun 		= (request.getParameter("page_set_gubun") == null)? 0 : Integer.parseInt(request.getParameter("page_set_gubun")); // 페이지 셋 디스플레이 구분

    //local variables
    int total_pages 	= (int)Math.ceil((double)total_records /records_per_page) ;  // 총 페이지 수


    if(curr_page_no > 1 && total_records > 0){
    out.write("<a href=\"javascript:"+js_fn_nm+"(1);\"><img src=\"/html/comm_img/bu_first01.gif\" alt=\"처음 페이지로\" border=\"0\" ></a>");
    } else {
        out.write("<img src=\"/html/comm_img/bu_first01.gif\" alt=\"처음 페이지로\" border=\"0\" >");
    }

    if( curr_page_no > 1 && total_records > 0){
        out.write("<a href=\"javascript:"+js_fn_nm+"("+ (curr_page_no - 1) +");\"><img src=\"/html/comm_img/bu_prev01.gif\" alt=\"이전 페이지로\" border=\"0\"></a>");
    }else{
        out.write("<img src=\"/html/comm_img/bu_prev01.gif\" alt=\"이전 페이지로\">");
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
        out.write("<a href=\"javascript:"+js_fn_nm+"("+ (curr_page_no + 1)+");\"><img src=\"/html/comm_img/bu_next01.gif\" alt=\"다음 페이지로\" border=\"0\" ></a>");
    }else{
        out.write("<img src=\"/html/comm_img/bu_next01.gif\" alt=\"다음 페이지로\" border=\"0\" >");
    }
    if(total_records > 0 && curr_page_no < total_pages ){
        out.write("<a href=\"javascript:"+js_fn_nm+"("+total_pages+");\"><img src=\"/html/comm_img/bu_end01.gif\" border=\"0\" alt=\"마지막 페이지로\"></a>");
    }else{
        out.write("<img src=\"/html/comm_img/bu_end01.gif\" border=\"0\" alt=\"마지막 페이지로\" >");
    }

%>