/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.evlu.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.evlu.dm.*;
import chosun.ciis.hd.evlu.rec.*;

/**
 * 
 */


public class HD_EVLU_3500_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist3 = new ArrayList();
	public ArrayList xx_curlist4 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;
	public String valid_evlu_cd;
	public String xx_cd_010;
	public String xx_cd_020;
	public String xx_cd_030;
	public String xx_cd_040;
	public String xx_evlu_stat_cd_010;
	public String xx_evlu_stat_cd_020;

	public HD_EVLU_3500_MDataSet(){}
	public HD_EVLU_3500_MDataSet(String errcode, String errmsg, String valid_evlu_cd, String xx_cd_010, String xx_cd_020, String xx_cd_030, String xx_cd_040, String xx_evlu_stat_cd_010, String xx_evlu_stat_cd_020){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.valid_evlu_cd = valid_evlu_cd;
		this.xx_cd_010 = xx_cd_010;
		this.xx_cd_020 = xx_cd_020;
		this.xx_cd_030 = xx_cd_030;
		this.xx_cd_040 = xx_cd_040;
		this.xx_evlu_stat_cd_010 = xx_evlu_stat_cd_010;
		this.xx_evlu_stat_cd_020 = xx_evlu_stat_cd_020;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setValid_evlu_cd(String valid_evlu_cd){
		this.valid_evlu_cd = valid_evlu_cd;
	}

	public void setXx_cd_010(String xx_cd_010){
		this.xx_cd_010 = xx_cd_010;
	}

	public void setXx_cd_020(String xx_cd_020){
		this.xx_cd_020 = xx_cd_020;
	}

	public void setXx_cd_030(String xx_cd_030){
		this.xx_cd_030 = xx_cd_030;
	}

	public void setXx_cd_040(String xx_cd_040){
		this.xx_cd_040 = xx_cd_040;
	}

	public void setXx_evlu_stat_cd_010(String xx_evlu_stat_cd_010){
		this.xx_evlu_stat_cd_010 = xx_evlu_stat_cd_010;
	}

	public void setXx_evlu_stat_cd_020(String xx_evlu_stat_cd_020){
		this.xx_evlu_stat_cd_020 = xx_evlu_stat_cd_020;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getValid_evlu_cd(){
		return this.valid_evlu_cd;
	}

	public String getXx_cd_010(){
		return this.xx_cd_010;
	}

	public String getXx_cd_020(){
		return this.xx_cd_020;
	}

	public String getXx_cd_030(){
		return this.xx_cd_030;
	}

	public String getXx_cd_040(){
		return this.xx_cd_040;
	}

	public String getXx_evlu_stat_cd_010(){
		return this.xx_evlu_stat_cd_010;
	}

	public String getXx_evlu_stat_cd_020(){
		return this.xx_evlu_stat_cd_020;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.valid_evlu_cd = Util.checkString(cstmt.getString(5));
		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			HD_EVLU_3500_MCURLIST1Record rec = new HD_EVLU_3500_MCURLIST1Record();
			rec.evlu_cd = Util.checkString(rset0.getString("evlu_cd"));
			rec.evlu_cdnm = Util.checkString(rset0.getString("evlu_cdnm"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			HD_EVLU_3500_MCURLIST2Record rec = new HD_EVLU_3500_MCURLIST2Record();
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(8);
		while(rset2.next()){
			HD_EVLU_3500_MCURLIST3Record rec = new HD_EVLU_3500_MCURLIST3Record();
			rec.cd = Util.checkString(rset2.getString("cd"));
			rec.cdnm = Util.checkString(rset2.getString("cdnm"));
			this.curlist3.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(9);
		while(rset3.next()){
			HD_EVLU_3500_MXX_CURLIST4Record rec = new HD_EVLU_3500_MXX_CURLIST4Record();
			rec.cd = Util.checkString(rset3.getString("cd"));
			rec.cdnm = Util.checkString(rset3.getString("cdnm"));
			this.xx_curlist4.add(rec);
		}
		this.xx_cd_010 = Util.checkString(cstmt.getString(10));
		this.xx_cd_020 = Util.checkString(cstmt.getString(11));
		this.xx_cd_030 = Util.checkString(cstmt.getString(12));
		this.xx_cd_040 = Util.checkString(cstmt.getString(13));
		this.xx_evlu_stat_cd_010 = Util.checkString(cstmt.getString(14));
		this.xx_evlu_stat_cd_020 = Util.checkString(cstmt.getString(15));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_EVLU_3500_MDataSet ds = (HD_EVLU_3500_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		HD_EVLU_3500_MCURLIST1Record curlist1Rec = (HD_EVLU_3500_MCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		HD_EVLU_3500_MCURLIST2Record curlist2Rec = (HD_EVLU_3500_MCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		HD_EVLU_3500_MCURLIST3Record curlist3Rec = (HD_EVLU_3500_MCURLIST3Record)ds.curlist3.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.xx_curlist4.size(); i++){
		HD_EVLU_3500_MXX_CURLIST4Record xx_curlist4Rec = (HD_EVLU_3500_MXX_CURLIST4Record)ds.xx_curlist4.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getValid_evlu_cd()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
<%= ds.getCurlist3()%>
<%= ds.getXx_curlist4()%>
<%= ds.getXx_cd_010()%>
<%= ds.getXx_cd_020()%>
<%= ds.getXx_cd_030()%>
<%= ds.getXx_cd_040()%>
<%= ds.getXx_evlu_stat_cd_010()%>
<%= ds.getXx_evlu_stat_cd_020()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.evlu_cd%>
<%= curlist1Rec.evlu_cdnm%>
<%= curlist2Rec.cd%>
<%= curlist2Rec.cdnm%>
<%= curlist3Rec.cd%>
<%= curlist3Rec.cdnm%>
<%= xx_curlist4Rec.cd%>
<%= xx_curlist4Rec.cdnm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Feb 21 17:46:23 KST 2012 */