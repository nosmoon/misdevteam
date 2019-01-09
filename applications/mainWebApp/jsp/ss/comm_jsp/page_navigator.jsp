<%@ page contentType="text/html; charset=KSC5601" %>
<!--JSP COMMENT START------------------------------------------------------------------------------->
<%---------------------------------------------------------------------------------------------------
* 파일명 : page_navigator.jsp
* 기능 	: 페이지 네비게이터
* 		 특기사항 - Paging Set Size 가 10 으로 고정되어 있음
*		 주의사항 - 처음.이전,다음,마지막 링크가 걸리는 이미지 file의 URL 은 실제 적용시 절대경로를 이용할 것.
*			- 네비게이터를 include 하는 jsp 페이지내에 hidden form 과 그에 상응하는 javascript 함수가 있어야함.
*			- javascript 함수의 signature 는 반드시  function xxxxxx(pageno) 이어야 함.
* 작성일자 : 2003-11-03
* 작성자 : 김영윤
---------------------------------------------------------------------------------------------------%>
<!--JSP COMMENT END--------------------------------------------------------------------------------->
<%
    // request variables (필수항목)
    int pageno; 		// 현재 페이지 번호 (default : 1)
    int totalcnt;		// 총 레코드 수			(default : 0)
    String js_fn_nm; 		// 자바스크립트 함수명 (default : "")

    pageno 	= (request.getParameter("pageno") == null)? 1 : Integer.parseInt(request.getParameter("pageno")); // 현재 페이지 번호
    totalcnt = (request.getParameter("totalcnt") == null)? 0 : Integer.parseInt(request.getParameter("totalcnt"));; // 총 레코드 수
    js_fn_nm = (request.getParameter("js_fn_nm") == null)? "" : request.getParameter("js_fn_nm"); // 이미지나 페이지 셋 번호 링크에 적용될 자바스크립트 함수명

    // request variables (옵션항목)
    int pagesize;	// 페이지당 레코드 수 (default : 10)
    int page_set_gubun;					// 처음,이전,다음,마지막 이미지 사이에 " 1 2 3 4 5 6 7 8 9 10 " 페이지 셋을 보여 줌 ( 0 : 보여줌 , 1 : 안 보여줌 ) (default : 0)

    pagesize 	= (request.getParameter("pagesize") == null)? 10 : Integer.parseInt(request.getParameter("pagesize")); //한 페이지당 레코드수 default 값 10
    page_set_gubun 		= (request.getParameter("page_set_gubun") == null)? 0 : Integer.parseInt(request.getParameter("page_set_gubun")); // 페이지 셋 디스플레이 구분

    //local variables
    int total_pages 	= (int)Math.ceil((double)totalcnt /pagesize) ;  // 총 페이지 수


    if(pageno > 1 && totalcnt > 0){
	  	out.write("\n<input type=\"image\" id=\"first_page_btn\" src=\"/html/comm_img/bu_first01.gif\" alt=\"처음 페이지로\" border=\"0\" align=\"absmiddle\" onclick=\""+js_fn_nm+"(1);window.event.returnValue=false;\">");
    } else {
		out.write("\n<input type=\"image\" id=\"first_page_btn\" src=\"/html/comm_img/bu_first01.gif\" alt=\"처음 페이지로\" border=\"0\" align=\"absmiddle\" onclick=\"window.event.returnValue=false;\">");
    }

    if( pageno > 1 && totalcnt > 0){
		out.write("\n<input type=\"image\" id=\"prev_page_btn\" src=\"/html/comm_img/bu_prev01.gif\" alt=\"이전 페이지로\" border=\"0\" align=\"absmiddle\" onclick=\""+js_fn_nm+"("+ (pageno - 1) +");window.event.returnValue=false;\">");
    }else{
		out.write("\n<input type=\"image\" id=\"prev_page_btn\" src=\"/html/comm_img/bu_prev01.gif\" alt=\"이전 페이지로\" align=\"absmiddle\" onclick=\"window.event.returnValue=false;\">");
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
		out.write("\n<input type=\"image\" id=\"next_page_btn\" src=\"/html/comm_img/bu_next01.gif\" alt=\"다음 페이지로\" border=\"0\" align=\"absmiddle\" onclick=\""+js_fn_nm+"("+ (pageno + 1)+");window.event.returnValue=false;\">");
    }else{
		out.write("\n<input type=\"image\" id=\"next_page_btn\" src=\"/html/comm_img/bu_next01.gif\" alt=\"다음 페이지로\" border=\"0\" align=\"absmiddle\" onclick=\"window.event.returnValue=false;\">");
    }
    if(totalcnt > 0 && pageno < total_pages ){
		out.write("\n<input type=\"image\" id=\"last_page_btn\" src=\"/html/comm_img/bu_end01.gif\" border=\"0\" alt=\"마지막 페이지로\" align=\"absmiddle\" onclick=\""+js_fn_nm+"("+total_pages+");window.event.returnValue=false;\">");
    }else{
		out.write("\n<input type=\"image\" id=\"last_page_btn\" src=\"/html/comm_img/bu_end01.gif\" border=\"0\" alt=\"마지막 페이지로\" align=\"absmiddle\" onclick=\"window.event.returnValue=false;\">");
    }

%>