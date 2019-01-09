<%---------------------------------------------------------------------------------------------------
* file name : ss_common.jsp
* function : common module for common code
* new date : 2003-10-27
* writer : unongko
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* update_info :
* updater :
* update date :
* backup file name : 
---------------------------------------------------------------------------------------------------%>
<%@ page errorPage="/jsp/ss/comm_jsp/sys_error.jsp"%>
<%@	page import="
		java.sql.*,
		java.text.*,
		java.lang.*,
		java.util.*,
		java.io.*,
		java.text.*,
		java.math.*,
		javax.ejb.*,
		javax.servlet.jsp.*,
		somo.framework.db.*,
		somo.framework.expt.*,
		somo.framework.log.*,
		somo.framework.prop.*,
		somo.framework.servlet.*,
		somo.framework.lib.*,
        somo.framework.util.*,
		chosun.ciis.ss.sls.common.ds.*,
		chosun.ciis.ss.sls.common.rec.*,
		chosun.ciis.ss.sls.common.dm.*,
		chosun.ciis.ss.sls.brinfo.ds.*,
		chosun.ciis.ss.sls.brinfo.rec.*,
		chosun.ciis.ss.sls.brinfo.dm.*,
		chosun.ciis.ss.sls.rdr.ds.*,
		chosun.ciis.ss.sls.rdr.rec.*,
		chosun.ciis.ss.sls.rdr.dm.*,
		chosun.ciis.ss.sls.extn.ds.*,
		chosun.ciis.ss.sls.extn.rec.*,
		chosun.ciis.ss.sls.extn.dm.*,
		chosun.ciis.ss.sls.move.ds.*,
		chosun.ciis.ss.sls.move.rec.*,
		chosun.ciis.ss.sls.move.dm.*,
		chosun.ciis.ss.sls.brsup.ds.*,
		chosun.ciis.ss.sls.brsup.rec.*,
		chosun.ciis.ss.sls.brsup.dm.*,
		chosun.ciis.ss.sls.brmgr.ds.*,
		chosun.ciis.ss.sls.brmgr.rec.*,
		chosun.ciis.ss.sls.brmgr.dm.*,
		chosun.ciis.ss.sls.share.ds.*,
		chosun.ciis.ss.sls.share.rec.*,
		chosun.ciis.ss.sls.share.dm.*,
		chosun.ciis.ss.sls.admin.ds.*,
		chosun.ciis.ss.sls.admin.rec.*,
		chosun.ciis.ss.sls.admin.dm.*,
		chosun.ciis.ss.sal.rdr.ds.*,
		chosun.ciis.ss.sal.rdr.rec.*,
		chosun.ciis.ss.sal.rdr.dm.*,
		chosun.ciis.ss.sls.cns.ds.*,
		chosun.ciis.ss.sls.cns.rec.*,
		chosun.ciis.ss.sls.cns.dm.*,
		chosun.ciis.ss.sls.ca.ds.*,
		chosun.ciis.ss.sls.ca.rec.*,
		chosun.ciis.ss.sls.ca.dm.*,
        com.ksnet.card.*
"%>

<%!
	// session 적용여부
	public boolean applySession = true;

	public ArrayList getTokens(String s, String d){
		ArrayList al = new ArrayList();

		StringTokenizer st = new StringTokenizer(s, d);
		while(st.hasMoreTokens()){
			String temp = st.nextToken();
			al.add(temp);
		}
		return al;
	}



    /*
    	부서코드, 코드명 목록 출력
    	세션을 적용할 경우는 세션의 부서코드,부서명 목록을 출력하고, 적용하지 않을 경우는 DataSet의 부서코드,부서명 목록을 출력한다.
    */
	public void writeDeptOpt(HttpSession session, JspWriter out, String optHtml, boolean all) throws IOException{
		// 세션 적용여부
		if(applySession == true){

			String dealdeptnm = (String)session.getAttribute("dealdeptnm");

			ArrayList dealdeptnmList = getTokens(dealdeptnm, "^");		// 구분자 "^"

			if(dealdeptnmList.size() == 0){		// 부서코드,부서명 갯수가 없음.

				// 부서코드,부서명이 존재하지 않음. 에러처리

			}else if(dealdeptnmList.size() == 1){	// 부서코드,부서명 갯수가 하나.
				// 부서코드,부서명이 하나
				// 전체,선택 필요없음
				String dealdeptcdnm = (String)dealdeptnmList.get(0);

				ArrayList dealdeptcdnmList = getTokens(dealdeptcdnm, "|");		// 구분자 "|"
				if(dealdeptcdnmList.size() == 2){
					out.print("<option value=\""+dealdeptcdnmList.get(0)+"\" selected>"+dealdeptcdnmList.get(1)+"</option>");	// selected 포함
				}else{
					// 부서코드, 부서명 쌍이 맞지 않음. 에러처리
				}

			}else{	// 부서코드,부서명 갯수가 여러개.
				if(all){
					out.print("<option value=\"\" selected>전체</option>");
				}else{
					out.print("<option value=\"\" selected>선택</option>");
				}
				// 부서코드,부서명이 여러개
				// 전체,선택 필요.
				for(int i=0; i<dealdeptnmList.size(); i++){
					String dealdeptcdnm = (String)dealdeptnmList.get(i);
					ArrayList dealdeptcdnmList = getTokens(dealdeptcdnm, "|");	// 구분자 "|"
					if(dealdeptcdnmList.size() == 2){
						out.print("<option value=\""+dealdeptcdnmList.get(0)+"\">"+dealdeptcdnmList.get(1)+"</option>");		// selected 제외
					}else{
						// 부서코드, 부서명 쌍이 맞지 않음. 에러처리
					}
				}
			}

		}else{
			if(all){
				out.print("<option value=\"\" selected>전체</option>");
			}else{
				out.print("<option value=\"\" selected>선택</option>");
			}
			out.print(optHtml);
		}
	}


	/*
		지역코드, 코드명 목록 처리
		세션을 적용할 경우는 부서코드,부서명 갯수가 1인 경우는 세션의 지역코드,코드명을 출력하고 세션을 적용하지 않을 경우는 전체,또는 선택을 뿌려준다.
	*/
	public void writeAreaOpt(HttpSession session, JspWriter out, boolean all) throws IOException{

		// 세션 적용여부
		if(applySession == true){

			String dealdeptnm = (String)session.getAttribute("dealdeptnm");

			ArrayList dealdeptnmList = getTokens(dealdeptnm, "^");		// 구분자 "^"

			if(dealdeptnmList.size() == 0){		// 부서코드,부서명 갯수가 없음.

				// 부서코드,부서명이 존재하지 않음. 에러처리

			}else if(dealdeptnmList.size() == 1){	// 부서코드,부서명 갯수가 하나.

				// session의 지역코드, 지역명 목록으로 <option>을 구성한다.

				String areanm = (String)session.getAttribute("areanm");
				ArrayList areanmList = getTokens(areanm, "^");		// 구분자 "^"


				if(areanmList.size() == 0){	// 지역코드,지역명 갯수가 없음.
					// 지역코드,지역명이 존재하지 않음. 에러처리
				}else if(areanmList.size() == 1){	// 지역코드,지역명 갯수가 하나.

                    out.print("<option value=\"\" selected>전체</option>");

					String areacdnm = (String)areanmList.get(0);
					ArrayList areacdnmList = getTokens(areacdnm, "|");	// 구분자 "|"
					if(areacdnmList.size() == 2){
						out.print("<option value=\""+areacdnmList.get(0)+"\">"+areacdnmList.get(1)+"</option>");
					}else{
						// 지역코드, 지역명 상이 맞지 않음. 에러처리.
					}
				}else{	// 지역코드,지역명 갯수가 여러개.

					if(all){
						out.print("<option value=\"\" selected>전체</option>");
					}else{
						out.print("<option value=\"\" selected>선택</option>");
					}

					for(int i=0; i<areanmList.size(); i++){
						String areacdnm = (String)areanmList.get(i);
						ArrayList areacdnmList = getTokens(areacdnm, "|");	// 구분자 "|"
						if(areacdnmList.size() == 2){
							out.print("<option value=\""+areacdnmList.get(0)+"\">"+areacdnmList.get(1)+"</option>");
						}else{
							// 지역코드, 지역명 상이 맞지 않음. 에러처리
						}
					}
				}

			}else{	// 부서코드,부서명 갯수가 여러개.
				if(all){
					out.print("<option value=\"\" selected>전체</option>");
				}else{
					out.print("<option value=\"\" selected>선택</option>");
				}

			}
		}else{
			if(all){
				out.print("<option value=\"\" selected>전체</option>");
			}else{
				out.print("<option value=\"\" selected>선택</option>");
			}
		}
	}

	/*
		사용자 소속회사별 매체 처리
		세션을 적용할 경우는 사용자의 소속회사에 따라 아래와 같이 설정한다.
			1. 스포츠조선(203) 	: 스포츠조선(610)
			2. 에듀조선(315) 	: 쎄쎄쎄(613), TEPS(420)
			3. 기타				: 모든 매체
	*/
	public void writeMediOpt(HttpSession session, JspWriter out, String optHtml, boolean all) throws IOException{
		// 세션 적용여부
		if(applySession == true){

			String cmpycd = (String)session.getAttribute("cmpycd");
			if("203".equals(cmpycd)){
				out.print("<option value=\"");
				out.print("610");
				out.print("\" selected>");
				out.print("스포츠조선");
				out.print("</option>");
			}else if("315".equals(cmpycd)){
				if(all){
					out.print("<option value=\"\" selected>전체</option>");
				}else{
					out.print("<option value=\"\" selected>선택</option>");
				}
				out.print("<option value=\"");
				out.print("613");
				out.print("\">");
				out.print("쎄쎄쎄");
				out.print("</option>");
				out.print("<option value=\"");
				out.print("420");
				out.print("\">");
				out.print("TEPS");
				out.print("</option>");
			}else{
				if(all){
					out.print("<option value=\"\" selected>전체</option>");
				}else{
					out.print("<option value=\"\" selected>선택</option>");
				}
				out.print(optHtml);
			}
		}else{
			if(all){
				out.print("<option value=\"\" selected>전체</option>");
			}else{
				out.print("<option value=\"\" selected>선택</option>");
			}
			out.print(optHtml);
		}
	}

    // 전달된 쿠키에 설정된 값을 얻어서 리턴한다.
    public String getCookieParameterValue(javax.servlet.http.HttpServletRequest req, String param, boolean required){
        String ret = "";
        Cookie[] cookies = req.getCookies();
        if(cookies != null){
            for(int i=0; i<cookies.length; i++){
                if(cookies[i].getName().equals(param)){
                    ret = Util.Uni2Ksc(cookies[i].getValue());
                }
            }
        }

        if("".equals(ret) && required) ret = Util.getSessionParameterValue(req, "emp_nm", true);
        return ret;
    }

%>
