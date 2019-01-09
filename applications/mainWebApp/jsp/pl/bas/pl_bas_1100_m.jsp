<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.pl.bas.rec.*
	,	chosun.ciis.pl.bas.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : pl_bas_1100_m.jsp
* ��� : 
* �ۼ����� : 2009-02-25
* �ۼ��� : ����
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : 
* ������ : 
* �������� : 
* ������ϸ� : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	PL_BAS_1100_MDataSet ds = (PL_BAS_1100_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;

	String errcode = "";
	String errmsg = "";

	errcode = (String)ds.errcode;
	errmsg  = (String)ds.errmsg;

	resData = rx.add(root, "comboSet", "");

	try {
		//�����
		int issu_cmpy = rx.add(resData, "issu_cmpy", "");	
		for(int i = 0; i < ds.issu_cmpycur.size(); i++) {
			PL_BAS_1100_MISSU_CMPYCURRecord rec = (PL_BAS_1100_MISSU_CMPYCURRecord)ds.issu_cmpycur.get(i);
			int record = rx.add(issu_cmpy, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
		}

		//��ü�ڵ�
		int medi_cd = rx.add(resData, "medi_cd", "");	
		for(int i = 0; i < ds.medi_cdcur.size(); i++) {
			PL_BAS_1100_MMEDI_CDCURRecord rec = (PL_BAS_1100_MMEDI_CDCURRecord)ds.medi_cdcur.get(i);
			int record = rx.add(medi_cd, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "issu_cmpy", rec.issu_cmpy);
			rx.add(record, "medi_clsf", rec.medi_clsf);
		}

		//����з�
		int cont_clas = rx.add(resData, "cont_clas", "");	
		for(int i = 0; i < ds.cont_clascur.size(); i++) {
			PL_BAS_1100_MCONT_CLASCURRecord rec = (PL_BAS_1100_MCONT_CLASCURRecord)ds.cont_clascur.get(i);
			int record = rx.add(cont_clas, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
		}

		//����
		int type = rx.add(resData, "type", "");	
		for(int i = 0; i < ds.typecur.size(); i++) {
			PL_BAS_1100_MTYPECURRecord rec = (PL_BAS_1100_MTYPECURRecord)ds.typecur.get(i);
			int record = rx.add(type, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
		}

		//���Ǳ���
		int absence_clsf = rx.add(resData, "absence_clsf", "");	
		for(int i = 0; i < ds.absence_clsfcur.size(); i++) {
			PL_BAS_1100_MABSENCE_CLSFCURRecord rec = (PL_BAS_1100_MABSENCE_CLSFCURRecord)ds.absence_clsfcur.get(i);
			int record = rx.add(absence_clsf, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
		}

		//�Ǽ�
		int ecnt = rx.add(resData, "ecnt", "");	
		for(int i = 0; i < ds.ecntcur.size(); i++) {
			PL_BAS_1100_MECNTCURRecord rec = (PL_BAS_1100_MECNTCURRecord)ds.ecntcur.get(i);
			int record = rx.add(ecnt, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
		}

		//�԰���
		int ewh_clsf = rx.add(resData, "ewh_clsf", "");	
		for(int i = 0; i < ds.ewh_clsfcur.size(); i++) {
			PL_BAS_1100_MEWH_CLSFCURRecord rec = (PL_BAS_1100_MEWH_CLSFCURRecord)ds.ewh_clsfcur.get(i);
			int record = rx.add(ewh_clsf, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
		}

		//â���ڵ�
		int wh_cd = rx.add(resData, "wh_cd", "");	
		for(int i = 0; i < ds.wh_cdcur.size(); i++) {
			PL_BAS_1100_MWH_CDCURRecord rec = (PL_BAS_1100_MWH_CDCURRecord)ds.wh_cdcur.get(i);
			int record = rx.add(wh_cd, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
		}

	} catch (Exception e) {
		errcode += " JSP Error";
		errmsg += " JSP Error Message = " + e.getMessage();
	} finally {
		rx.add(resData, "errcode", errcode);
		rx.add(resData, "errmsg", errmsg);
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
