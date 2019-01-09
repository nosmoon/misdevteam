<%---------------------------------------------------------------------------------------------------
* file name : ss_common_x.jsp
* function : common module for common code under TrustForm
* new date : 2008-01-22
* writer : 황성진
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
		chosun.ciis.ss.sls.health.ds.*,
		chosun.ciis.ss.sls.health.rec.*,
		chosun.ciis.ss.sls.health.dm.*,
        com.ksnet.card.*,
        kr.co.comsquare.rwXmlLib.*,
        chosun.ciis.co.lib.xi.RwXmlWrapper,
        chosun.ciis.co.lib.xi.RwXmlWrapper2
"%>

<%!
	// session 적용여부
	public boolean applySession = true;

	/******
	 * Utils...
	 ******/

	public ArrayList getTokens(String s, String d){
		ArrayList al = new ArrayList();

		StringTokenizer st = new StringTokenizer(s, d);
		while(st.hasMoreTokens()){
			String temp = st.nextToken();
			al.add(temp);
		}
		return al;
	}
	
    /******
     * trustform 관련 기존 함수 변경.
     ******/
    
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
    
    /******
     * Business. 기존함수.
     ******/
    
	/*
		사용자 소속회사별 매체 처리
		세션을 적용할 경우는 사용자의 소속회사에 따라 아래와 같이 설정한다.
			1. 스포츠조선(203) 	: 스포츠조선(610)
			2. 에듀조선(315) 	: 쎄쎄쎄(613), TEPS(420)
			3. 기타				: 모든 매체
	*/
	public void writeMediOpt(HttpSession session, RwXmlWrapper rxw, int depth, boolean all, Object obj, String arrayName, String labelField, String valueField) 
			throws IOException, IllegalArgumentException, IllegalAccessException, Exception
	{
		// 세션 적용여부
		if(applySession == true){

			String cmpycd = (String)session.getAttribute("cmpycd");
			if("203".equals(cmpycd)){
				rxw.addSelectItem(depth, "스포츠조선", "610");
			}else if("315".equals(cmpycd)){
				if(all){
					rxw.addSelectItem(depth, "전체", "");
				}else{
					rxw.addSelectItem(depth, "선택", "");
				}
				rxw.addSelectItem(depth, "쎄쎄쎄", "613");
				rxw.addSelectItem(depth, "TEPS", "420");
			}else{
				rxw.makeDataToList(obj, arrayName, labelField, valueField, all?"전체":"선택", "", depth, null);
			}
		}else{
			rxw.makeDataToList(obj, arrayName, labelField, valueField, all?"전체":"선택", "", depth, null);
		}
	}


    /*
		부서코드, 코드명 목록 출력
		세션을 적용할 경우는 세션의 부서코드,부서명 목록을 출력하고, 적용하지 않을 경우는 DataSet의 부서코드,부서명 목록을 출력한다.
	*/
	public void writeDeptOpt(HttpSession session, RwXmlWrapper rxw, int depth, boolean all) throws IOException{
		int itemDepth = 0;
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
					//rxw.addSelectItem(depth, (String)dealdeptcdnmList.get(1), (String)dealdeptcdnmList.get(0));
					rxw.addSelectItem(depth, "record", "dept_nm", "dept_cd", (String)dealdeptcdnmList.get(1), (String)dealdeptcdnmList.get(0));
				}else{
					// 부서코드, 부서명 쌍이 맞지 않음. 에러처리
				}
	
			}else{	// 부서코드,부서명 갯수가 여러개.
				if(all){
					//rxw.addSelectItem(depth, "전체", "");
					rxw.addSelectItem(depth, "record", "dept_nm", "dept_cd", "전체", "");
				}else{
					//rxw.addSelectItem(depth, "선택", "");
					rxw.addSelectItem(depth, "record", "dept_nm", "dept_cd", "선택", "");
				}
				// 부서코드,부서명이 여러개
				// 전체,선택 필요.
				for(int i=0; i<dealdeptnmList.size(); i++){
					String dealdeptcdnm = (String)dealdeptnmList.get(i);
					ArrayList dealdeptcdnmList = getTokens(dealdeptcdnm, "|");	// 구분자 "|"
					if(dealdeptcdnmList.size() == 2){
						//rxw.addSelectItem(depth, (String)dealdeptcdnmList.get(1), (String)dealdeptcdnmList.get(0));
						rxw.addSelectItem(depth, "record", "dept_nm", "dept_cd", (String)dealdeptcdnmList.get(1), (String)dealdeptcdnmList.get(0));
					}else{
						// 부서코드, 부서명 쌍이 맞지 않음. 에러처리
					}
				}
			}
	
		}else{
			if(all){
				//rxw.addSelectItem(depth, "전체", "");
				rxw.addSelectItem(depth, "record", "dept_nm", "dept_cd", "전체", "");
			}else{
				//rxw.addSelectItem(depth, "선택", "");
				rxw.addSelectItem(depth, "record", "dept_nm", "dept_cd", "선택", "");
			}
			//do nothing. 호출하는 jsp에서 data set을 통해 구성.
		}
	}
    
	/*
		부서코드, 코드명 목록 출력
		세션을 적용할 경우는 세션의 부서코드,부서명 목록을 출력하고, 적용하지 않을 경우는 DataSet의 부서코드,부서명 목록을 출력한다.
		Dataset 개체를 직접 받아 세션 적용 여부에 따라 dataset 개체 값을 사용.
	*/
	public void writeDeptOpt(HttpSession session, RwXmlWrapper rxw, int depth, boolean all, Object obj, String arrayName, String labelField, String valueField) 
		throws IOException, IllegalArgumentException, IllegalAccessException, Exception
	{
		int itemDepth = 0;
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
					//rxw.addSelectItem(depth, (String)dealdeptcdnmList.get(1), (String)dealdeptcdnmList.get(0));
					rxw.addSelectItem(depth, "record", "dept_nm", "dept_cd", (String)dealdeptcdnmList.get(1), (String)dealdeptcdnmList.get(0));
				}else{
					// 부서코드, 부서명 쌍이 맞지 않음. 에러처리
				}
	
			}else{	// 부서코드,부서명 갯수가 여러개.
				if(all){
					//rxw.addSelectItem(depth, "전체", "");
					rxw.addSelectItem(depth, "record", "dept_nm", "dept_cd", "전체", "");
				}else{
					//rxw.addSelectItem(depth, "선택", "");
					rxw.addSelectItem(depth, "record", "dept_nm", "dept_cd", "선택", "");
				}
				// 부서코드,부서명이 여러개
				// 전체,선택 필요.
				for(int i=0; i<dealdeptnmList.size(); i++){
					String dealdeptcdnm = (String)dealdeptnmList.get(i);
					ArrayList dealdeptcdnmList = getTokens(dealdeptcdnm, "|");	// 구분자 "|"
					if(dealdeptcdnmList.size() == 2){
						//rxw.addSelectItem(depth, (String)dealdeptcdnmList.get(1), (String)dealdeptcdnmList.get(0));
						rxw.addSelectItem(depth, "record", "dept_nm", "dept_cd", (String)dealdeptcdnmList.get(1), (String)dealdeptcdnmList.get(0));
					}else{
						// 부서코드, 부서명 쌍이 맞지 않음. 에러처리
					}
				}
			}
	
		}else{
			rxw.makeDataToList(obj, arrayName, labelField, valueField, all?"전체":"선택", "", depth, null, "record", "dept_nm", "dept_cd");
		}
	}
	
	
	/*
		지역코드, 코드명 목록 처리
		세션을 적용할 경우는 부서코드,부서명 갯수가 1인 경우는 세션의 지역코드,코드명을 출력하고 세션을 적용하지 않을 경우는 전체,또는 선택을 뿌려준다.
	*/
	public void writeAreaOpt(HttpSession session, RwXmlWrapper rxw, int depth, boolean all) throws IOException{
	
		int itemDepth = 0;
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
	
					//rxw.addSelectItem(depth, "전체", "");
					rxw.addSelectItem(depth, "record", "area_nm", "area_cd", "전체", "");
	
					String areacdnm = (String)areanmList.get(0);
					ArrayList areacdnmList = getTokens(areacdnm, "|");	// 구분자 "|"
					if(areacdnmList.size() == 2){
						//rxw.addSelectItem(depth, (String)areacdnmList.get(1), (String)areacdnmList.get(0));
						rxw.addSelectItem(depth, "record", "area_nm", "area_cd", (String)areacdnmList.get(1), (String)areacdnmList.get(0));
					}else{
						// 지역코드, 지역명 상이 맞지 않음. 에러처리.
					}
				}else{	// 지역코드,지역명 갯수가 여러개.
	
					if(all){
						//rxw.addSelectItem(depth, "전체", "");
						rxw.addSelectItem(depth, "record", "area_nm", "area_cd", "전체", "");
					}else{
						//rxw.addSelectItem(depth, "선택", "");
						rxw.addSelectItem(depth, "record", "area_nm", "area_cd", "선택", "");
					}
	
					for(int i=0; i<areanmList.size(); i++){
						String areacdnm = (String)areanmList.get(i);
						ArrayList areacdnmList = getTokens(areacdnm, "|");	// 구분자 "|"
						if(areacdnmList.size() == 2){
							//rxw.addSelectItem(depth, (String)areacdnmList.get(1), (String)areacdnmList.get(0));
							rxw.addSelectItem(depth, "record", "area_nm", "area_cd", (String)areacdnmList.get(1), (String)areacdnmList.get(0));
						}else{
							// 지역코드, 지역명 상이 맞지 않음. 에러처리
						}
					}
				}
	
			}else{	// 부서코드,부서명 갯수가 여러개.
				if(all){
					//rxw.addSelectItem(depth, "전체", "");
					rxw.addSelectItem(depth, "record", "area_nm", "area_cd", "전체", "");
				}else{
					//rxw.addSelectItem(depth, "선택", "");
					rxw.addSelectItem(depth, "record", "area_nm", "area_cd", "선택", "");
				}
	
			}
		}else{
			if(all){
				//rxw.addSelectItem(depth, "전체", "");
				rxw.addSelectItem(depth, "record", "area_nm", "area_cd", "전체", "");
			}else{
				//rxw.addSelectItem(depth, "선택", "");
				rxw.addSelectItem(depth, "record", "area_nm", "area_cd", "선택", "");
			}
		}
	}

%>
