<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.snd.rec.*
	,	chosun.ciis.se.snd.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : se_snd_1110_l.jsp
* ��� : �Ǹ� - �߼۰��� - �뼱��� - �뼱�� �μ�ó, ������, �Ǽ� ��ȸ
* �ۼ����� : 2009.02.03
* �ۼ��� : �����
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	RwXml rx = new RwXml();
	SE_SND_1110_LDataSet ds = (SE_SND_1110_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = "";
	String errmsg = "";

	dataSet = rx.add(root, "gridData", "");
	rx.add(dataSet, "rownum", ds.rownum);
	errcode = ds.errcode;
	errmsg = ds.errmsg;

	try {
		/****** CURLIST BEGIN */
		dataSet = rx.add(dataSet, "list", "");
		recordSet = rx.add(dataSet, "main", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_SND_1110_LCURLISTRecord rec = (SE_SND_1110_LCURLISTRecord)ds.curlist.get(i);
			
			if ( "".equals(rec.num) || rec.num == "0" ){
				break;
			}
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd"		, rec.cmpy_cd		);		//ȸ�籸���ڵ�
			rx.add(record, "medi_cd"		, rec.medi_cd		);		//��ü�ڵ�
			rx.add(record, "medi_nm"		, rec.medi_nm		);		//��ü��
			rx.add(record, "route_cd"		, rec.route_cd		);		//�뼱�ڵ�
			rx.add(record, "route_nm"		, rec.route_nm		);		//�뼱��
			rx.add(record, "route_clsf"		, rec.route_clsf	);		//�뼱����
			rx.add(record, "prt_plac_cd"	, rec.prt_plac_cd	);		//�μ�ó�ڵ�
			rx.add(record, "ecnt_cd"		, rec.ecnt_cd		);		//�Ǽ��ڵ�
			rx.add(record, "ledt_cd"		, rec.ledt_cd		);		//�������ڵ�
			rx.add(record, "inwsp_send_yn"  , rec.inwsp_send_yn );		//�����߼ۿ���
			rx.add(record, "route_rank"  	, rec.route_rank    );		//�뼱����
		}
		rx.add(recordSet, "totalcnt", ds.curlist.size());
		/****** CURTLIST END */
	}
	catch (Exception e) {
		errcode += " JSP Error";
		errmsg += " JSP Error Message = " + e.getMessage();
	}
	finally {
		rx.add(dataSet, "errcode", errcode);
		rx.add(dataSet, "errmsg", errmsg);
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<% /* �ۼ��ð� : Tue Jan 20 15:56:25 KST 2009 */ %>