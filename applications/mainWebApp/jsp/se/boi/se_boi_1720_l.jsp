<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.boi.ds.*
	,	chosun.ciis.se.boi.rec.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : se_boi_1720_l.jsp
* ��� : �μ��ΰ�ó�� - ����/�����
* �ۼ����� : 2009-05-20
* �ۼ��� : ��â��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : 
* ������ : 
* �������� : 
* ������ϸ� : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	SE_BOI_1720_LDataSet ds = (SE_BOI_1720_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	resform = rx.add(root, "resform", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_BOI_1720_LCURLISTRecord rec = (SE_BOI_1720_LCURLISTRecord)ds.curlist.get(i);
			rx.add(resform, "area_cd", rec.area_cd);
			rx.add(resform, "chrg_pers", rec.chrg_pers);
			rx.add(resform, "bo_nm", rec.bo_nm);
			
			//�ؾ࿹������ �������
			if(!"".equals(rec.hbbcd)){
			
				rx.add(resform, "cntr_stat_nm_g", "�ؾ࿹��");
				rx.add(resform, "cntr_stat_nm_s", "����");
				rx.add(resform, "bo_cdseq_g", rec.hbbcd+rec.hseq);
				rx.addCData(resform, "bo_head_nm_g", rec.hjjnm);
				//ó������ ��ȸ�ϰ��
				if(!"".equals(rec.jdjp)) rx.add(resform, "gy_amt_g", rec.jgybj);
				else rx.add(resform, "gy_amt_g", rec.hgybj);
				rx.add(resform, "misu_dt", rec.hmisuymd);
				rx.add(resform, "bo_cdseq_s", rec.gbbcd+rec.gseq);
				rx.addCData(resform, "bo_head_nm_s", rec.gjjnm);
				rx.add(resform, "gy_amt_s", rec.ggybj);
				rx.add(resform, "misu_dt", rec.gmisuymd);
				
				if(ds.jd_yymm.equals(ds.rcpm_yymm)){
					if(!"".equals(rec.jdjp)) rx.add(resform, "jd_amt_g", rec.jjida);
					else rx.add(resform, "jd_amt_g", rec.hjida);
					rx.add(resform, "jd_amt_s", rec.gjida);
				
				}else{
					if(!"".equals(rec.jdjp)) rx.add(resform, "jd_amt_g", rec.jjida);
					else rx.add(resform, "jd_amt_g", rec.hiwja);
					rx.add(resform, "jd_amt_s", rec.giwja);
					
				}			
			}else{
				if(!"".equals(rec.gbbcd)){
					rx.add(resform, "cntr_stat_nm_g", "����");
					rx.add(resform, "cntr_stat_nm_s", "����");
				}else{
					rx.add(resform, "cntr_stat_nm_g", "");
					rx.add(resform, "cntr_stat_nm_s", "");
				}
				rx.add(resform, "bo_cdseq_g", rec.gbbcd+rec.gseq);
				rx.addCData(resform, "bo_head_nm_g", rec.gjjnm);
				if(!"".equals(rec.jdjp)){
					rx.add(resform, "jd_amt_g", rec.jjida);
					rx.add(resform, "gy_amt_g", rec.jgybj);
				}else{
					rx.add(resform, "jd_amt_g", rec.giwja);
					rx.add(resform, "gy_amt_g", rec.ggybj);
				}
				rx.add(resform, "misu_dt", rec.gmisuymd);
				rx.add(resform, "bo_cdseq_s", rec.sbbcd+rec.sseq);
				rx.addCData(resform, "bo_head_nm_s", rec.sjjnm);
				rx.add(resform, "gy_amt_s", rec.sgybj);
				rx.add(resform, "jd_amt_s", rec.siwja);
				rx.add(resform, "misu_dt", rec.smisuymd);
			
			}
			
		}
	} catch (Exception e) {
	} finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<resData>
	<CURLIST>
		<record>
			<chrg_pers/>
			<gbbcd/>
			<gseq/>
			<gjjnm/>
			<gmisuymd/>
			<gjida/>
			<giwja/>
			<ggybj/>
			<gjnbj/>
			<sbbcd/>
			<sseq/>
			<sjjnm/>
			<smisuymd/>
			<sjida/>
			<siwja/>
			<sgybj/>
			<sjnbj/>
			<hbbcd/>
			<hseq/>
			<hjjnm/>
			<hmisuymd/>
			<hjida/>
			<hiwja/>
			<hgybj/>
			<hjnbj/>
			<jdjp/>
			<jjida/>
			<jgybj/>
			<jjnbj/>
		</record>
	</CURLIST>
</resData>
*/
%>

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<resData>
	<resform>
		<curlist/>
	</resform>
</resData>
*/
%>

<% /* �ۼ��ð� : Wed May 20 13:56:04 KST 2009 */ %>
