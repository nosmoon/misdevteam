/***************************************************************************************************
* 파일명 : SE_SND_1310_LDataSet.java
* 기능 : 판매 - 발송관리 - 노선별인쇄처변경
* 작성일자 : 2009.01.30
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
import chosun.ciis.se.snd.dm.*;
import chosun.ciis.se.snd.rec.*;

/**
 * 
 */


public class SE_SND_1310_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	
	public SE_SND_1310_LDataSet(){}
	public SE_SND_1310_LDataSet(String errcode, String errmsg){
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

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode 	= Util.checkString(cstmt.getString(1));
		this.errmsg 	= Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			SE_SND_1310_LCURLISTRecord rec = new SE_SND_1310_LCURLISTRecord();
			
			rec.cmpy_cd           = Util.checkString(rset0.getString("cmpy_cd"		    ));                                 
			rec.reg_dt            = Util.checkString(rset0.getString("reg_dt"		    ));                                 
			rec.reg_seq           = Util.checkString(rset0.getString("reg_seq"		    ));                                 
			rec.route_clsf        = Util.checkString(rset0.getString("route_clsf"		));                                 
			rec.bgn_route_cd      = Util.checkString(rset0.getString("bgn_route_cd"		));                                 
			rec.end_route_cd      = Util.checkString(rset0.getString("end_route_cd"		));                                 
			rec.medi_cd           = Util.checkString(rset0.getString("medi_cd"		    ));                                 
			rec.prt_plac_cd       = Util.checkString(rset0.getString("prt_plac_cd"		));                                 
			rec.incmg_pers        = Util.checkString(rset0.getString("incmg_pers"		));                                 
			rec.incmg_dt_tm       = Util.checkString(rset0.getString("incmg_dt_tm"		));                                 
			rec.bgn_route_nm      = Util.checkString(rset0.getString("bgn_route_nm"		));                                 
			rec.end_route_nm      = Util.checkString(rset0.getString("end_route_nm"		));
			
			this.curlist.add(rec);
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