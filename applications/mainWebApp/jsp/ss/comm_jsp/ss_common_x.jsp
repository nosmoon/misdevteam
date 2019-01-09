<%---------------------------------------------------------------------------------------------------
* file name : ss_common_x.jsp
* function : common module for common code under TrustForm
* new date : 2008-01-22
* writer : Ȳ����
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
	// session ���뿩��
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
     * trustform ���� ���� �Լ� ����.
     ******/
    
    // ���޵� ��Ű�� ������ ���� �� �����Ѵ�.
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
     * Business. �����Լ�.
     ******/
    
	/*
		����� �Ҽ�ȸ�纰 ��ü ó��
		������ ������ ���� ������� �Ҽ�ȸ�翡 ���� �Ʒ��� ���� �����Ѵ�.
			1. ����������(203) 	: ����������(610)
			2. ��������(315) 	: ����(613), TEPS(420)
			3. ��Ÿ				: ��� ��ü
	*/
	public void writeMediOpt(HttpSession session, RwXmlWrapper rxw, int depth, boolean all, Object obj, String arrayName, String labelField, String valueField) 
			throws IOException, IllegalArgumentException, IllegalAccessException, Exception
	{
		// ���� ���뿩��
		if(applySession == true){

			String cmpycd = (String)session.getAttribute("cmpycd");
			if("203".equals(cmpycd)){
				rxw.addSelectItem(depth, "����������", "610");
			}else if("315".equals(cmpycd)){
				if(all){
					rxw.addSelectItem(depth, "��ü", "");
				}else{
					rxw.addSelectItem(depth, "����", "");
				}
				rxw.addSelectItem(depth, "����", "613");
				rxw.addSelectItem(depth, "TEPS", "420");
			}else{
				rxw.makeDataToList(obj, arrayName, labelField, valueField, all?"��ü":"����", "", depth, null);
			}
		}else{
			rxw.makeDataToList(obj, arrayName, labelField, valueField, all?"��ü":"����", "", depth, null);
		}
	}


    /*
		�μ��ڵ�, �ڵ�� ��� ���
		������ ������ ���� ������ �μ��ڵ�,�μ��� ����� ����ϰ�, �������� ���� ���� DataSet�� �μ��ڵ�,�μ��� ����� ����Ѵ�.
	*/
	public void writeDeptOpt(HttpSession session, RwXmlWrapper rxw, int depth, boolean all) throws IOException{
		int itemDepth = 0;
		// ���� ���뿩��
		if(applySession == true){
	
			String dealdeptnm = (String)session.getAttribute("dealdeptnm");
	
			ArrayList dealdeptnmList = getTokens(dealdeptnm, "^");		// ������ "^"
	
			if(dealdeptnmList.size() == 0){		// �μ��ڵ�,�μ��� ������ ����.
	
				// �μ��ڵ�,�μ����� �������� ����. ����ó��
	
			}else if(dealdeptnmList.size() == 1){	// �μ��ڵ�,�μ��� ������ �ϳ�.
				// �μ��ڵ�,�μ����� �ϳ�
				// ��ü,���� �ʿ����
				String dealdeptcdnm = (String)dealdeptnmList.get(0);
	
				ArrayList dealdeptcdnmList = getTokens(dealdeptcdnm, "|");		// ������ "|"
				if(dealdeptcdnmList.size() == 2){
					//rxw.addSelectItem(depth, (String)dealdeptcdnmList.get(1), (String)dealdeptcdnmList.get(0));
					rxw.addSelectItem(depth, "record", "dept_nm", "dept_cd", (String)dealdeptcdnmList.get(1), (String)dealdeptcdnmList.get(0));
				}else{
					// �μ��ڵ�, �μ��� ���� ���� ����. ����ó��
				}
	
			}else{	// �μ��ڵ�,�μ��� ������ ������.
				if(all){
					//rxw.addSelectItem(depth, "��ü", "");
					rxw.addSelectItem(depth, "record", "dept_nm", "dept_cd", "��ü", "");
				}else{
					//rxw.addSelectItem(depth, "����", "");
					rxw.addSelectItem(depth, "record", "dept_nm", "dept_cd", "����", "");
				}
				// �μ��ڵ�,�μ����� ������
				// ��ü,���� �ʿ�.
				for(int i=0; i<dealdeptnmList.size(); i++){
					String dealdeptcdnm = (String)dealdeptnmList.get(i);
					ArrayList dealdeptcdnmList = getTokens(dealdeptcdnm, "|");	// ������ "|"
					if(dealdeptcdnmList.size() == 2){
						//rxw.addSelectItem(depth, (String)dealdeptcdnmList.get(1), (String)dealdeptcdnmList.get(0));
						rxw.addSelectItem(depth, "record", "dept_nm", "dept_cd", (String)dealdeptcdnmList.get(1), (String)dealdeptcdnmList.get(0));
					}else{
						// �μ��ڵ�, �μ��� ���� ���� ����. ����ó��
					}
				}
			}
	
		}else{
			if(all){
				//rxw.addSelectItem(depth, "��ü", "");
				rxw.addSelectItem(depth, "record", "dept_nm", "dept_cd", "��ü", "");
			}else{
				//rxw.addSelectItem(depth, "����", "");
				rxw.addSelectItem(depth, "record", "dept_nm", "dept_cd", "����", "");
			}
			//do nothing. ȣ���ϴ� jsp���� data set�� ���� ����.
		}
	}
    
	/*
		�μ��ڵ�, �ڵ�� ��� ���
		������ ������ ���� ������ �μ��ڵ�,�μ��� ����� ����ϰ�, �������� ���� ���� DataSet�� �μ��ڵ�,�μ��� ����� ����Ѵ�.
		Dataset ��ü�� ���� �޾� ���� ���� ���ο� ���� dataset ��ü ���� ���.
	*/
	public void writeDeptOpt(HttpSession session, RwXmlWrapper rxw, int depth, boolean all, Object obj, String arrayName, String labelField, String valueField) 
		throws IOException, IllegalArgumentException, IllegalAccessException, Exception
	{
		int itemDepth = 0;
		// ���� ���뿩��
		if(applySession == true){
	
			String dealdeptnm = (String)session.getAttribute("dealdeptnm");
	
			ArrayList dealdeptnmList = getTokens(dealdeptnm, "^");		// ������ "^"
	
			if(dealdeptnmList.size() == 0){		// �μ��ڵ�,�μ��� ������ ����.
	
				// �μ��ڵ�,�μ����� �������� ����. ����ó��
	
			}else if(dealdeptnmList.size() == 1){	// �μ��ڵ�,�μ��� ������ �ϳ�.
				// �μ��ڵ�,�μ����� �ϳ�
				// ��ü,���� �ʿ����
				String dealdeptcdnm = (String)dealdeptnmList.get(0);
	
				ArrayList dealdeptcdnmList = getTokens(dealdeptcdnm, "|");		// ������ "|"
				if(dealdeptcdnmList.size() == 2){
					//rxw.addSelectItem(depth, (String)dealdeptcdnmList.get(1), (String)dealdeptcdnmList.get(0));
					rxw.addSelectItem(depth, "record", "dept_nm", "dept_cd", (String)dealdeptcdnmList.get(1), (String)dealdeptcdnmList.get(0));
				}else{
					// �μ��ڵ�, �μ��� ���� ���� ����. ����ó��
				}
	
			}else{	// �μ��ڵ�,�μ��� ������ ������.
				if(all){
					//rxw.addSelectItem(depth, "��ü", "");
					rxw.addSelectItem(depth, "record", "dept_nm", "dept_cd", "��ü", "");
				}else{
					//rxw.addSelectItem(depth, "����", "");
					rxw.addSelectItem(depth, "record", "dept_nm", "dept_cd", "����", "");
				}
				// �μ��ڵ�,�μ����� ������
				// ��ü,���� �ʿ�.
				for(int i=0; i<dealdeptnmList.size(); i++){
					String dealdeptcdnm = (String)dealdeptnmList.get(i);
					ArrayList dealdeptcdnmList = getTokens(dealdeptcdnm, "|");	// ������ "|"
					if(dealdeptcdnmList.size() == 2){
						//rxw.addSelectItem(depth, (String)dealdeptcdnmList.get(1), (String)dealdeptcdnmList.get(0));
						rxw.addSelectItem(depth, "record", "dept_nm", "dept_cd", (String)dealdeptcdnmList.get(1), (String)dealdeptcdnmList.get(0));
					}else{
						// �μ��ڵ�, �μ��� ���� ���� ����. ����ó��
					}
				}
			}
	
		}else{
			rxw.makeDataToList(obj, arrayName, labelField, valueField, all?"��ü":"����", "", depth, null, "record", "dept_nm", "dept_cd");
		}
	}
	
	
	/*
		�����ڵ�, �ڵ�� ��� ó��
		������ ������ ���� �μ��ڵ�,�μ��� ������ 1�� ���� ������ �����ڵ�,�ڵ���� ����ϰ� ������ �������� ���� ���� ��ü,�Ǵ� ������ �ѷ��ش�.
	*/
	public void writeAreaOpt(HttpSession session, RwXmlWrapper rxw, int depth, boolean all) throws IOException{
	
		int itemDepth = 0;
		// ���� ���뿩��
		if(applySession == true){
	
			String dealdeptnm = (String)session.getAttribute("dealdeptnm");
	
			ArrayList dealdeptnmList = getTokens(dealdeptnm, "^");		// ������ "^"
	
			if(dealdeptnmList.size() == 0){		// �μ��ڵ�,�μ��� ������ ����.
	
				// �μ��ڵ�,�μ����� �������� ����. ����ó��
	
			}else if(dealdeptnmList.size() == 1){	// �μ��ڵ�,�μ��� ������ �ϳ�.
	
				// session�� �����ڵ�, ������ ������� <option>�� �����Ѵ�.
	
				String areanm = (String)session.getAttribute("areanm");
				ArrayList areanmList = getTokens(areanm, "^");		// ������ "^"
	
	
				if(areanmList.size() == 0){	// �����ڵ�,������ ������ ����.
					// �����ڵ�,�������� �������� ����. ����ó��
				}else if(areanmList.size() == 1){	// �����ڵ�,������ ������ �ϳ�.
	
					//rxw.addSelectItem(depth, "��ü", "");
					rxw.addSelectItem(depth, "record", "area_nm", "area_cd", "��ü", "");
	
					String areacdnm = (String)areanmList.get(0);
					ArrayList areacdnmList = getTokens(areacdnm, "|");	// ������ "|"
					if(areacdnmList.size() == 2){
						//rxw.addSelectItem(depth, (String)areacdnmList.get(1), (String)areacdnmList.get(0));
						rxw.addSelectItem(depth, "record", "area_nm", "area_cd", (String)areacdnmList.get(1), (String)areacdnmList.get(0));
					}else{
						// �����ڵ�, ������ ���� ���� ����. ����ó��.
					}
				}else{	// �����ڵ�,������ ������ ������.
	
					if(all){
						//rxw.addSelectItem(depth, "��ü", "");
						rxw.addSelectItem(depth, "record", "area_nm", "area_cd", "��ü", "");
					}else{
						//rxw.addSelectItem(depth, "����", "");
						rxw.addSelectItem(depth, "record", "area_nm", "area_cd", "����", "");
					}
	
					for(int i=0; i<areanmList.size(); i++){
						String areacdnm = (String)areanmList.get(i);
						ArrayList areacdnmList = getTokens(areacdnm, "|");	// ������ "|"
						if(areacdnmList.size() == 2){
							//rxw.addSelectItem(depth, (String)areacdnmList.get(1), (String)areacdnmList.get(0));
							rxw.addSelectItem(depth, "record", "area_nm", "area_cd", (String)areacdnmList.get(1), (String)areacdnmList.get(0));
						}else{
							// �����ڵ�, ������ ���� ���� ����. ����ó��
						}
					}
				}
	
			}else{	// �μ��ڵ�,�μ��� ������ ������.
				if(all){
					//rxw.addSelectItem(depth, "��ü", "");
					rxw.addSelectItem(depth, "record", "area_nm", "area_cd", "��ü", "");
				}else{
					//rxw.addSelectItem(depth, "����", "");
					rxw.addSelectItem(depth, "record", "area_nm", "area_cd", "����", "");
				}
	
			}
		}else{
			if(all){
				//rxw.addSelectItem(depth, "��ü", "");
				rxw.addSelectItem(depth, "record", "area_nm", "area_cd", "��ü", "");
			}else{
				//rxw.addSelectItem(depth, "����", "");
				rxw.addSelectItem(depth, "record", "area_nm", "area_cd", "����", "");
			}
		}
	}

%>
