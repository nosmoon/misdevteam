/***************************************************************************************************
* 파일명 : SE_BOI_2210_LDataSet.java
* 기능 : 판촉물관리 - 판촉물등록
* 작성일자 : 2009-03-16
* 작성자 : 이민효
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.boi.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.boi.dm.*;
import chosun.ciis.se.boi.rec.*;

/**
 * 
 */


public class SE_BOI_2210_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_BOI_2210_LDataSet(){}
	public SE_BOI_2210_LDataSet(String errcode, String errmsg){
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
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			SE_BOI_2210_LCURLISTRecord rec = new SE_BOI_2210_LCURLISTRecord();
			rec.dong_cd = Util.checkString(rset0.getString("dong_cd"));
			rec.yy = Util.checkString(rset0.getString("yy"));
			rec.sido = Util.checkString(rset0.getString("sido"));
			rec.gugun = Util.checkString(rset0.getString("gugun"));
			rec.dong = Util.checkString(rset0.getString("dong"));
			rec.apt_cnt = Util.checkString(rset0.getString("apt_cnt"));
			rec.mvin_apt_cnt = Util.checkString(rset0.getString("mvin_apt_cnt"));
			rec.tot_apt_cnt = Util.checkString(rset0.getString("tot_apt_cnt"));
			rec.hous_cnt = Util.checkString(rset0.getString("hous_cnt"));
			rec.shop_cnt = Util.checkString(rset0.getString("shop_cnt"));
			rec.offi_room_cnt = Util.checkString(rset0.getString("offi_room_cnt"));
			rec.tot_cnt = Util.checkString(rset0.getString("tot_cnt"));
			rec.popl_cnt = Util.checkString(rset0.getString("popl_cnt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_BOI_2210_LDataSet ds = (SE_BOI_2210_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_BOI_2210_LCURLISTRecord curlistRec = (SE_BOI_2210_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.dong_cd%>
<%= curlistRec.yy%>
<%= curlistRec.sido%>
<%= curlistRec.gugun%>
<%= curlistRec.apt_cnt%>
<%= curlistRec.mvin_apt_cnt%>
<%= curlistRec.tot_apt_cnt%>
<%= curlistRec.hous_cnt%>
<%= curlistRec.shop_cnt%>
<%= curlistRec.offi_room_cnt%>
<%= curlistRec.tot_cnt%>
<%= curlistRec.popl_cnt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 22 17:52:50 KST 2009 */