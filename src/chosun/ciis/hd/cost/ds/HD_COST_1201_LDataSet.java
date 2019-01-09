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


package chosun.ciis.hd.cost.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.cost.dm.*;
import chosun.ciis.hd.cost.rec.*;

/**
 * 
 */


public class HD_COST_1201_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public ArrayList xx_hd_card_type_list = new ArrayList();
	public String errcode;
	public String errmsg;
	public String xx_xx_cd_050;
	public String xx_xx_cd_060;

	public HD_COST_1201_LDataSet(){}
	public HD_COST_1201_LDataSet(String errcode, String errmsg, String xx_xx_cd_050, String xx_xx_cd_060){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_xx_cd_050 = xx_xx_cd_050;
		this.xx_xx_cd_060 = xx_xx_cd_060;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_xx_cd_050(String xx_xx_cd_050){
		this.xx_xx_cd_050 = xx_xx_cd_050;
	}

	public void setXx_xx_cd_060(String xx_xx_cd_060){
		this.xx_xx_cd_060 = xx_xx_cd_060;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_xx_cd_050(){
		return this.xx_xx_cd_050;
	}

	public String getXx_xx_cd_060(){
		return this.xx_xx_cd_060;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			HD_COST_1201_LCURLIST1Record rec = new HD_COST_1201_LCURLIST1Record();
			rec.cd_type = Util.checkString(rset0.getString("cd_type"));
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset0.getString("cd_abrv_nm"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			HD_COST_1201_LCURLIST2Record rec = new HD_COST_1201_LCURLIST2Record();
			rec.cd_type = Util.checkString(rset1.getString("cd_type"));
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset1.getString("cd_abrv_nm"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(7);
		while(rset2.next()){
			HD_COST_1201_LXX_HD_CARD_TYPE_LISTRecord rec = new HD_COST_1201_LXX_HD_CARD_TYPE_LISTRecord();
			rec.cd_type = Util.checkString(rset2.getString("cd_type"));
			rec.cd = Util.checkString(rset2.getString("cd"));
			rec.cdnm = Util.checkString(rset2.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset2.getString("cd_abrv_nm"));
			this.xx_hd_card_type_list.add(rec);
		}
		this.xx_xx_cd_050 = Util.checkString(cstmt.getString(8));
		this.xx_xx_cd_060 = Util.checkString(cstmt.getString(9));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_COST_1201_LDataSet ds = (HD_COST_1201_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		HD_COST_1201_LCURLIST1Record curlist1Rec = (HD_COST_1201_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		HD_COST_1201_LCURLIST2Record curlist2Rec = (HD_COST_1201_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.xx_hd_card_type_list.size(); i++){
		HD_COST_1201_LXX_HD_CARD_TYPE_LISTRecord xx_hd_card_type_listRec = (HD_COST_1201_LXX_HD_CARD_TYPE_LISTRecord)ds.xx_hd_card_type_list.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
<%= ds.getXx_hd_card_type_list()%>
<%= ds.getXx_xx_cd_050()%>
<%= ds.getXx_xx_cd_060()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.cd_type%>
<%= curlist1Rec.cd%>
<%= curlist1Rec.cdnm%>
<%= curlist1Rec.cd_abrv_nm%>
<%= curlist2Rec.cd_type%>
<%= curlist2Rec.cd%>
<%= curlist2Rec.cdnm%>
<%= curlist2Rec.cd_abrv_nm%>
<%= xx_hd_card_type_listRec.cd_type%>
<%= xx_hd_card_type_listRec.cd%>
<%= xx_hd_card_type_listRec.cdnm%>
<%= xx_hd_card_type_listRec.cd_abrv_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Feb 10 11:14:19 KST 2012 */