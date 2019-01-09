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
* 파일명 : se_boi_1720_l.jsp
* 기능 : 인수인계처리 - 내역/대상조
* 작성일자 : 2009-05-20
* 작성자 : 배창희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 : 
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
			
			//해약예정상태 있을경우
			if(!"".equals(rec.hbbcd)){
			
				rx.add(resform, "cntr_stat_nm_g", "해약예정");
				rx.add(resform, "cntr_stat_nm_s", "현임");
				rx.add(resform, "bo_cdseq_g", rec.hbbcd+rec.hseq);
				rx.addCData(resform, "bo_head_nm_g", rec.hjjnm);
				//처리내역 조회일경우
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
					rx.add(resform, "cntr_stat_nm_g", "현임");
					rx.add(resform, "cntr_stat_nm_s", "후임");
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
TrustForm의 Instance 선언부에 복사해서 사용
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
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<resform>
		<curlist/>
	</resform>
</resData>
*/
%>

<% /* 작성시간 : Wed May 20 13:56:04 KST 2009 */ %>
