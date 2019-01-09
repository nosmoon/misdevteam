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
	// session ���뿩��
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
    	�μ��ڵ�, �ڵ�� ��� ���
    	������ ������ ���� ������ �μ��ڵ�,�μ��� ����� ����ϰ�, �������� ���� ���� DataSet�� �μ��ڵ�,�μ��� ����� ����Ѵ�.
    */
	public void writeDeptOpt(HttpSession session, JspWriter out, String optHtml, boolean all) throws IOException{
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
					out.print("<option value=\""+dealdeptcdnmList.get(0)+"\" selected>"+dealdeptcdnmList.get(1)+"</option>");	// selected ����
				}else{
					// �μ��ڵ�, �μ��� ���� ���� ����. ����ó��
				}

			}else{	// �μ��ڵ�,�μ��� ������ ������.
				if(all){
					out.print("<option value=\"\" selected>��ü</option>");
				}else{
					out.print("<option value=\"\" selected>����</option>");
				}
				// �μ��ڵ�,�μ����� ������
				// ��ü,���� �ʿ�.
				for(int i=0; i<dealdeptnmList.size(); i++){
					String dealdeptcdnm = (String)dealdeptnmList.get(i);
					ArrayList dealdeptcdnmList = getTokens(dealdeptcdnm, "|");	// ������ "|"
					if(dealdeptcdnmList.size() == 2){
						out.print("<option value=\""+dealdeptcdnmList.get(0)+"\">"+dealdeptcdnmList.get(1)+"</option>");		// selected ����
					}else{
						// �μ��ڵ�, �μ��� ���� ���� ����. ����ó��
					}
				}
			}

		}else{
			if(all){
				out.print("<option value=\"\" selected>��ü</option>");
			}else{
				out.print("<option value=\"\" selected>����</option>");
			}
			out.print(optHtml);
		}
	}


	/*
		�����ڵ�, �ڵ�� ��� ó��
		������ ������ ���� �μ��ڵ�,�μ��� ������ 1�� ���� ������ �����ڵ�,�ڵ���� ����ϰ� ������ �������� ���� ���� ��ü,�Ǵ� ������ �ѷ��ش�.
	*/
	public void writeAreaOpt(HttpSession session, JspWriter out, boolean all) throws IOException{

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

                    out.print("<option value=\"\" selected>��ü</option>");

					String areacdnm = (String)areanmList.get(0);
					ArrayList areacdnmList = getTokens(areacdnm, "|");	// ������ "|"
					if(areacdnmList.size() == 2){
						out.print("<option value=\""+areacdnmList.get(0)+"\">"+areacdnmList.get(1)+"</option>");
					}else{
						// �����ڵ�, ������ ���� ���� ����. ����ó��.
					}
				}else{	// �����ڵ�,������ ������ ������.

					if(all){
						out.print("<option value=\"\" selected>��ü</option>");
					}else{
						out.print("<option value=\"\" selected>����</option>");
					}

					for(int i=0; i<areanmList.size(); i++){
						String areacdnm = (String)areanmList.get(i);
						ArrayList areacdnmList = getTokens(areacdnm, "|");	// ������ "|"
						if(areacdnmList.size() == 2){
							out.print("<option value=\""+areacdnmList.get(0)+"\">"+areacdnmList.get(1)+"</option>");
						}else{
							// �����ڵ�, ������ ���� ���� ����. ����ó��
						}
					}
				}

			}else{	// �μ��ڵ�,�μ��� ������ ������.
				if(all){
					out.print("<option value=\"\" selected>��ü</option>");
				}else{
					out.print("<option value=\"\" selected>����</option>");
				}

			}
		}else{
			if(all){
				out.print("<option value=\"\" selected>��ü</option>");
			}else{
				out.print("<option value=\"\" selected>����</option>");
			}
		}
	}

	/*
		����� �Ҽ�ȸ�纰 ��ü ó��
		������ ������ ���� ������� �Ҽ�ȸ�翡 ���� �Ʒ��� ���� �����Ѵ�.
			1. ����������(203) 	: ����������(610)
			2. ��������(315) 	: ����(613), TEPS(420)
			3. ��Ÿ				: ��� ��ü
	*/
	public void writeMediOpt(HttpSession session, JspWriter out, String optHtml, boolean all) throws IOException{
		// ���� ���뿩��
		if(applySession == true){

			String cmpycd = (String)session.getAttribute("cmpycd");
			if("203".equals(cmpycd)){
				out.print("<option value=\"");
				out.print("610");
				out.print("\" selected>");
				out.print("����������");
				out.print("</option>");
			}else if("315".equals(cmpycd)){
				if(all){
					out.print("<option value=\"\" selected>��ü</option>");
				}else{
					out.print("<option value=\"\" selected>����</option>");
				}
				out.print("<option value=\"");
				out.print("613");
				out.print("\">");
				out.print("����");
				out.print("</option>");
				out.print("<option value=\"");
				out.print("420");
				out.print("\">");
				out.print("TEPS");
				out.print("</option>");
			}else{
				if(all){
					out.print("<option value=\"\" selected>��ü</option>");
				}else{
					out.print("<option value=\"\" selected>����</option>");
				}
				out.print(optHtml);
			}
		}else{
			if(all){
				out.print("<option value=\"\" selected>��ü</option>");
			}else{
				out.print("<option value=\"\" selected>����</option>");
			}
			out.print(optHtml);
		}
	}

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

%>
