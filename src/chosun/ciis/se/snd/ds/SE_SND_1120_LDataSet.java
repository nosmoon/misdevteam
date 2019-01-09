/***************************************************************************************************
* 파일명 : SE_SND_1120_LDataSet.java
* 기능 : 판매 - 발송관리 - 노선등록
 * 작성일자 : 2009.02.03
 * 작성자 :   김대준
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
import chosun.ciis.se.bas.dm.*;
import chosun.ciis.se.bas.rec.*;
import chosun.ciis.se.snd.rec.SE_SND_1120_LSENDLISTRecord;

/**
 * 
 */


public class SE_SND_1120_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList sendlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String title;
	
	public SE_SND_1120_LDataSet(){}
	public SE_SND_1120_LDataSet(String errcode, String errmsg){
		this.errcode = errcode;
		this.errmsg = errmsg;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode 	= Util.checkString(cstmt.getString(1));
		this.errmsg 	= Util.checkString(cstmt.getString(2));
		this.title 		= Util.checkString(cstmt.getString(7));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			SE_SND_1120_LSENDLISTRecord rec = new SE_SND_1120_LSENDLISTRecord();
			
			rec.cmpy_cd               = Util.checkString(rset0.getString("cmpy_cd"));
			rec.bo_cd                 = Util.checkString(rset0.getString("bo_cd"));
			rec.send_plac_seq         = Util.checkString(rset0.getString("send_plac_seq"));
			rec.bo_cd_key             = Util.checkString(rset0.getString("bo_cd_key"));
			rec.send_plac_seq_key     = Util.checkString(rset0.getString("send_plac_seq_key"));
			rec.send_plac_nm          = Util.checkString(rset0.getString("send_plac_nm"));
			rec.route_clsf            = Util.checkString(rset0.getString("route_clsf"));
			rec.route_cd              = Util.checkString(rset0.getString("route_cd"));
			rec.send_rank             = Util.checkString(rset0.getString("send_rank"));
			rec.cnsg_seqo             = Util.checkString(rset0.getString("cnsg_seqo"));
			rec.area_cd               = Util.checkString(rset0.getString("area_cd"));
			rec.area_cd_key           = Util.checkString(rset0.getString("area_cd_key"));
			rec.area_nm               = Util.checkString(rset0.getString("area_nm"));
			rec.qty          		  = Util.checkString(rset0.getString("qty"));
			rec.send_mthd      		  = Util.checkString(rset0.getString("send_mthd"));
			
			this.sendlist.add(rec);
		}
		
	}
	
	
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_SND_1210_LDataSet ds = (SE_SND_1210_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_SND_1210_LCURLISTRecord curlistRec = (SE_SND_1210_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.cd%>
<%= curlistRec.cdnm%>
<%= curlistRec.mang_cd_1%>
<%= curlistRec.use_yn%>
<%= curlistRec.chg_dt_tm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jan 19 15:55:59 KST 2009 */