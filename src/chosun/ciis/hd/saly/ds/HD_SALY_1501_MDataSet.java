

package chosun.ciis.hd.saly.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.saly.dm.*;
import chosun.ciis.hd.saly.rec.*;

/**
 * 
 */


public class HD_SALY_1501_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public String base_saly;
	public String posk_saly;
	public String dty_alon; 
	public String posk_alon; 
	public String food_alon; 
	public String care_alon; 
	public String evngt_saly; 
	
	public HD_SALY_1501_MDataSet(){}
	public HD_SALY_1501_MDataSet(String errcode, String errmsg, String base_saly,String posk_saly,String dty_alon,String posk_alon,String food_alon,String care_alon,String evngt_saly){
		this.errcode = errcode;
		this.errmsg = errmsg;
		
		this.base_saly    = base_saly;     
		this.posk_saly    = posk_saly;    
		this.dty_alon     = dty_alon;          
		this.posk_alon    = posk_alon;          
		this.food_alon    = food_alon;         
		this.care_alon    = care_alon;                
		this.evngt_saly   = evngt_saly;         
		 
	}
	
	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}
	
	public void setBase_saly(String base_saly){
		this.base_saly = base_saly;
	}
	
	public void setPosk_saly(String posk_saly){
		this.posk_saly = posk_saly;
	}
	
	public void setDty_alon(String dty_alon){
		this.dty_alon = dty_alon;
	}
	
	public void setPosk_alon(String posk_alon){
		this.posk_alon = posk_alon;
	}	
	
	public void setFood_alon(String food_alon){
		this.food_alon = food_alon;
	}	
	
	public void setCare_alon(String care_alon){
		this.care_alon = care_alon;
	}	
	
	public void setEvngt_saly(String evngt_saly){
		this.evngt_saly = evngt_saly;
	}	
	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}
	
	public String getBase_saly(){
		return this.base_saly ;
	}
	
	public String getPosk_saly(){
		return this.posk_saly;
	}
	
	public String getDty_alon(){
		return this.dty_alon ;
	}
	
	public String getPosk_alon(){
		return this.posk_alon;
	}	
	
	public String getFood_alon(){
		return this.food_alon ;
	}	
	
	public String getCare_alon(){
		return this.care_alon ;
	}	
		
	public String getEvngt_saly(){
		return this.evngt_saly;
	}
	
	
	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}
		
		this.base_saly  	= Util.checkString(cstmt.getString(5));
		this.posk_saly    = Util.checkString(cstmt.getString(6));
		this.dty_alon          = Util.checkString(cstmt.getString(7));
		this.posk_alon          = Util.checkString(cstmt.getString(8));
		this.food_alon         = Util.checkString(cstmt.getString(9));
		this.care_alon                = Util.checkString(cstmt.getString(10));
		this.evngt_saly          = Util.checkString(cstmt.getString(11));

		
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_SALY_1300_LDataSet ds = (HD_SALY_1300_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_SALY_1300_LCURLISTRecord curlistRec = (HD_SALY_1300_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.saly_yy%>
<%= curlistRec.saly_no%>
<%= curlistRec.dept_cd%>
<%= curlistRec.dept_nm%>
<%= curlistRec.emp_no%>
<%= curlistRec.flnm%>
<%= curlistRec.dty_cd%>
<%= curlistRec.dty_nm%>
<%= curlistRec.posi_cd%>
<%= curlistRec.posi_nm%>
<%= curlistRec.base_saly%>
<%= curlistRec.posk_saly%>
<%= curlistRec.real_pay_rgla_saly%>
<%= curlistRec.prvmm_mstk_saly%>
<%= curlistRec.excp_resn%>
<%= curlistRec.proc_stat%>
<%= curlistRec.proc_stat_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 18 14:38:31 KST 2011 */