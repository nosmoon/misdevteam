/***************************************************************************************************
* 파일명 : SE_COMM_2410_LDataSet.java
* 기능 :  수송업자 팝업
* 작성일자 : 2009.06.09
* 작성자 :   김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.comm.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.comm.dm.*;
import chosun.ciis.se.comm.rec.*;

/**
 * 
 */


public class SE_COMM_2410_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_COMM_2410_LDataSet(){}
	public SE_COMM_2410_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(12);
		while(rset0.next()){
			SE_COMM_2410_LCURLISTRecord rec = new SE_COMM_2410_LCURLISTRecord();
			rec.route_clsf            = Util.checkString(rset0.getString("route_clsf"			));
			rec.tran_cmpy_cd          = Util.checkString(rset0.getString("tran_cmpy_cd"			));
			rec.tran_cmpy_nm          = Util.checkString(rset0.getString("tran_cmpy_nm"			));
			rec.tran_uprc_clas        = Util.checkString(rset0.getString("tran_uprc_clas"		));     
			rec.tran_uprc_cd          = Util.checkString(rset0.getString("tran_uprc_cd"			));       
			rec.tran_uprc_route_nm    = Util.checkString(rset0.getString("tran_uprc_route_nm"	)); 
			rec.prt_plac_cd           = Util.checkString(rset0.getString("prt_plac_cd"			));        
			rec.medi_cd               = Util.checkString(rset0.getString("medi_cd"				));            
			rec.sect_cd               = Util.checkString(rset0.getString("sect_cd"				));            
			rec.sect_nm               = Util.checkString(rset0.getString("sect_nm"				));
			rec.pay_tran_uprc         = Util.checkString(rset0.getString("pay_tran_uprc"		));          
			rec.work_dds              = Util.checkString(rset0.getString("work_dds"				));           
			rec.pay_tran_cost         = Util.checkString(rset0.getString("pay_tran_cost"		));            
			rec.dlco_no               = Util.checkString(rset0.getString("dlco_no"				));            
			rec.dlco_clsf             = Util.checkString(rset0.getString("dlco_clsf"			));          
			rec.tran_uprc_qty_clsf    = Util.checkString(rset0.getString("tran_uprc_qty_clsf"	)); 
			rec.cntr_dt               = Util.checkString(rset0.getString("cntr_dt"				));            
			rec.cctr_dt               = Util.checkString(rset0.getString("cctr_dt"				));            
			rec.ern                   = Util.checkString(rset0.getString("ern"					));                
			rec.bank_cd               = Util.checkString(rset0.getString("bank_cd"				));          
			rec.acct_no               = Util.checkString(rset0.getString("acct_no"				));            
			rec.zip                   = Util.checkString(rset0.getString("zip"					));                
			rec.addr                  = Util.checkString(rset0.getString("addr"					));               
			rec.dtls_addr             = Util.checkString(rset0.getString("dtls_addr"			));          
			rec.tel_no                = Util.checkString(rset0.getString("tel_no"				));             
			rec.car_no                = Util.checkString(rset0.getString("car_no"				));             

			this.curlist.add(rec);
		}
	
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_COMM_2100_MDataSet ds = (SE_COMM_2100_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_COMM_2100_MCURLISTRecord curlistRec = (SE_COMM_2100_MCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.routelist.size(); i++){
		SE_COMM_2100_MROUTELISTRecord routelistRec = (SE_COMM_2100_MROUTELISTRecord)ds.routelist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.prtlist.size(); i++){
		SE_COMM_2100_MPRTLISTRecord prtlistRec = (SE_COMM_2100_MPRTLISTRecord)ds.prtlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getRoutelist()%>
<%= ds.getPrtlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.cd%>
<%= curlistRec.cdnm%>
<%= curlistRec.cd_abrv_nm%>
<%= routelistRec.cd%>
<%= routelistRec.cdnm%>
<%= routelistRec.cd_abrv_nm%>
<%= prtlistRec.cd%>
<%= prtlistRec.cdnm%>
<%= prtlistRec.cd_abrv_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Feb 18 09:12:20 KST 2009 */