/***************************************************************************************************
* 파일명 : SE_SND_1910_LDataSet.java
* 기능 : 판매-발송관리-발송마스터
* 작성일자 : 2009-02-09
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.snd.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.snd.dm.*;
import chosun.ciis.se.snd.rec.*;

/**
 * 
 */


public class SE_SND_1910_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist 	= new ArrayList();
	public ArrayList routelist 	= new ArrayList();
	public ArrayList tranlist 	= new ArrayList();
	public String errcode;
	public String errmsg;
	public String rownum;

	public SE_SND_1910_LDataSet(){}
	public SE_SND_1910_LDataSet(String errcode, String errmsg, String rownum){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.rownum = rownum;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setRownum(String rownum){
		this.rownum = rownum;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getRownum(){
		return this.rownum;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode 	= Util.checkString(cstmt.getString(1));
		this.errmsg 	= Util.checkString(cstmt.getString(2));
		
		if(!"".equals(this.errcode)){			return;		}
		
		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			SE_SND_1910_LCURLISTRecord rec = new SE_SND_1910_LCURLISTRecord();
			rec.cmpy_cd 			= Util.checkString(rset0.getString("cmpy_cd"			));
			rec.bo_cd 				= Util.checkString(rset0.getString("bo_cd"				));
			rec.send_plac_seq 		= Util.checkString(rset0.getString("send_plac_seq"		));
			rec.send_plac_nm 		= Util.checkString(rset0.getString("send_plac_nm"		));
			rec.area_cd 			= Util.checkString(rset0.getString("area_cd"			));
			rec.send_plac_feat_clas = Util.checkString(rset0.getString("send_plac_feat_clas"));
			rec.ariv_nomn 			= Util.checkString(rset0.getString("ariv_nomn"			));
			rec.band 				= Util.checkString(rset0.getString("band"				));
			rec.stetsell_clsf 		= Util.checkString(rset0.getString("stetsell_clsf"		));
			rec.stetsell_nm 		= Util.checkString(rset0.getString("stetsell_nm"		));
			rec.etc_area_clas		= Util.checkString(rset0.getString("etc_area_clas"		));
			rec.clas_clsf 			= Util.checkString(rset0.getString("clas_clsf"			));
			rec.use_yn 				= Util.checkString(rset0.getString("use_yn"				));
			rec.qty 				= Util.checkString(rset0.getString("qty"				));
			rec.area_nm 			= Util.checkString(rset0.getString("area_nm"			));
			rec.sido_cd 			= Util.checkString(rset0.getString("sido_cd"			));
			rec.sido_nm 			= Util.checkString(rset0.getString("sido_nm"			));
			rec.part_cd 			= Util.checkString(rset0.getString("part_cd"			));
			rec.part_nm 			= Util.checkString(rset0.getString("part_nm"			));
			rec.team_cd 			= Util.checkString(rset0.getString("team_cd"			));
			rec.team_nm 			= Util.checkString(rset0.getString("team_nm"			));
			rec.bo_feat_clsf 		= Util.checkString(rset0.getString("bo_feat_clsf"		));
			rec.bo_feat_nm 			= Util.checkString(rset0.getString("bo_feat_nm"			));
			rec.ddtotshet_qty 		= Util.checkString(rset0.getString("ddtotshet_qty"		));
			rec.bo_seq		 		= Util.checkString(rset0.getString("bo_seq"				));
			this.curlist.add(rec);
		}
		
		ResultSet rset1 = (ResultSet) cstmt.getObject(8);
		while(rset1.next()){
			SE_SND_1910_LROUTELISTRecord rec = new SE_SND_1910_LROUTELISTRecord();
			rec.cmpy_cd				= Util.checkString(rset1.getString("cmpy_cd"       ));
			rec.route_clsf    		= Util.checkString(rset1.getString("route_clsf"    ));
			rec.route_clsf_nm 		= Util.checkString(rset1.getString("route_clsf_nm" ));
			rec.route_cd      		= Util.checkString(rset1.getString("route_cd"      ));
			rec.route_rank     		= Util.checkString(rset1.getString("route_rank"    ));
			rec.route_nm      		= Util.checkString(rset1.getString("route_nm"      ));
			rec.send_rank     		= Util.checkString(rset1.getString("send_rank"     ));
			rec.cnsg_seqo     		= Util.checkString(rset1.getString("cnsg_seqo"     ));
			rec.use_yn				= Util.checkString(rset1.getString("use_yn"        ));

			this.routelist.add(rec);
		}
		
		ResultSet rset2 = (ResultSet) cstmt.getObject(9);
		while(rset2.next()){
			SE_SND_1910_LTRANLISTRecord rec = new SE_SND_1910_LTRANLISTRecord();
			rec.cmpy_cd 			= Util.checkString(rset2.getString("cmpy_cd"		));
			rec.route_clsf 			= Util.checkString(rset2.getString("route_clsf"		));
			rec.route_clsf_nm		= Util.checkString(rset2.getString("route_clsf_nm"	));
			rec.tran_cmpy_nm 		= Util.checkString(rset2.getString("tran_cmpy_nm"	));
			rec.tran_cost 			= Util.checkString(rset2.getString("tran_cost"		));
			rec.tel_no 				= Util.checkString(rset2.getString("tel_no"			));
			rec.ptph_no 			= Util.checkString(rset2.getString("ptph_no"		));
			rec.cntr_dt 			= Util.checkString(rset2.getString("cntr_dt"		));
			rec.cctr_dt 			= Util.checkString(rset2.getString("cctr_dt"		));
			this.tranlist.add(rec);
		}
		this.rownum = Util.checkString(cstmt.getString(10));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_SND_1910_LDataSet ds = (SE_SND_1910_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_SND_1910_LCURLISTRecord curlistRec = (SE_SND_1910_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.tranlist.size(); i++){
		SE_SND_1910_LTRANLISTRecord tranlistRec = (SE_SND_1910_LTRANLISTRecord)ds.tranlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getTranlist()%>
<%= ds.getRownum()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.cmpy_cd%>
<%= curlistRec.bo_cd%>
<%= curlistRec.send_plac_seq%>
<%= curlistRec.send_plac_nm%>
<%= curlistRec.area_cd%>
<%= curlistRec.send_plac_feat_clas%>
<%= curlistRec.ariv_nomn%>
<%= curlistRec.band%>
<%= curlistRec.stetsell_clsf%>
<%= curlistRec.stetsell_nm%>
<%= curlistRec.clas_clsf%>
<%= curlistRec.use_yn%>
<%= curlistRec.qty%>
<%= curlistRec.area_nm%>
<%= curlistRec.sido_cd%>
<%= curlistRec.sido_nm%>
<%= curlistRec.part_cd%>
<%= curlistRec.part_nm%>
<%= curlistRec.team_cd%>
<%= curlistRec.team_nm%>
<%= curlistRec.bo_feat_clsf%>
<%= curlistRec.bo_feat_nm%>
<%= curlistRec.ddtotshet_qty%>
<%= tranlistRec.cmpy_cd%>
<%= tranlistRec.route_clsf%>
<%= tranlistRec.tran_cmpy_nm%>
<%= tranlistRec.tran_cost%>
<%= tranlistRec.tel_no%>
<%= tranlistRec.ptph_no%>
<%= tranlistRec.cntr_dt%>
<%= tranlistRec.cctr_dt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Feb 09 10:18:19 KST 2009 */