

package chosun.ciis.hd.info.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.info.dm.*;
import chosun.ciis.hd.info.rec.*;

/**
 * 
 */


public class HD_INFO_2500_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist4 = new ArrayList();
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public ArrayList curlist6 = new ArrayList();
	public ArrayList curlist5 = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_INFO_2500_LDataSet(){}
	public HD_INFO_2500_LDataSet(String errcode, String errmsg){
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
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			HD_INFO_2500_LCURLISTRecord rec = new HD_INFO_2500_LCURLISTRecord();
			rec.group_month = Util.checkString(rset0.getString("group_month"));
			rec.emp_cnt = Util.checkString(rset0.getString("emp_cnt"));
			rec.fix_labr_dds = Util.checkString(rset0.getString("fix_labr_dds"));
			rec.no_duty_dds = Util.checkString(rset0.getString("no_duty_dds"));
			rec.paid_duty_dds = Util.checkString(rset0.getString("paid_duty_dds"));
			rec.fix_labr_tm = Util.checkString(rset0.getString("fix_labr_tm"));
			rec.paid_duty_tm = Util.checkString(rset0.getString("paid_duty_tm"));
			rec.tot_pay_saly_sum = Util.checkString(rset0.getString("tot_pay_saly_sum"));
			rec.rgla_saly_sum = Util.checkString(rset0.getString("rgla_saly_sum"));
			rec.add_saly_sum = Util.checkString(rset0.getString("add_saly_sum"));
			rec.etc_saly_amt_sum = Util.checkString(rset0.getString("etc_saly_amt_sum"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			HD_INFO_2500_LCURLIST2Record rec = new HD_INFO_2500_LCURLIST2Record();
			rec.group_month = Util.checkString(rset1.getString("group_month"));
			rec.imsi_emp_cnt = Util.checkString(rset1.getString("imsi_emp_cnt"));
			rec.imsi_duty_dt = Util.checkString(rset1.getString("imsi_duty_dt"));
			rec.imsi_duty_tm = Util.checkString(rset1.getString("imsi_duty_tm"));
			rec.imsi_pay_amt = Util.checkString(rset1.getString("imsi_pay_amt"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(8);
		while(rset2.next()){
			HD_INFO_2500_LCURLIST3Record rec = new HD_INFO_2500_LCURLIST3Record();
			rec.group_month = Util.checkString(rset2.getString("group_month"));
			rec.faml_emp_cnt = Util.checkString(rset2.getString("faml_emp_cnt"));
			rec.fmal_duty_dds = Util.checkString(rset2.getString("fmal_duty_dds"));
			rec.fmal_duty_tm = Util.checkString(rset2.getString("fmal_duty_tm"));
			rec.fmal_pay_amt = Util.checkString(rset2.getString("fmal_pay_amt"));
			this.curlist3.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(9);
		while(rset3.next()){
			HD_INFO_2500_LCURLIST4Record rec = new HD_INFO_2500_LCURLIST4Record();
			rec.group_month = Util.checkString(rset3.getString("group_month"));
			rec.emp_cnt = Util.checkString(rset3.getString("emp_cnt"));
			rec.fix_labr_dds = Util.checkString(rset3.getString("fix_labr_dds"));
			rec.no_duty_dds = Util.checkString(rset3.getString("no_duty_dds"));
			rec.paid_duty_dds = Util.checkString(rset3.getString("paid_duty_dds"));
			rec.fix_labr_tm = Util.checkString(rset3.getString("fix_labr_tm"));
			rec.paid_duty_tm = Util.checkString(rset3.getString("paid_duty_tm"));
			rec.tot_pay_saly_sum = Util.checkString(rset3.getString("tot_pay_saly_sum"));
			rec.rgla_saly_sum = Util.checkString(rset3.getString("rgla_saly_sum"));
			rec.add_saly_sum = Util.checkString(rset3.getString("add_saly_sum"));
			rec.etc_saly_amt_sum = Util.checkString(rset3.getString("etc_saly_amt_sum"));
			this.curlist4.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(10);
		while(rset4.next()){
			HD_INFO_2500_LCURLIST5Record rec = new HD_INFO_2500_LCURLIST5Record();
			rec.group_month = Util.checkString(rset4.getString("group_month"));
			rec.imsi_emp_cnt = Util.checkString(rset4.getString("imsi_emp_cnt"));
			rec.imsi_duty_dt = Util.checkString(rset4.getString("imsi_duty_dt"));
			rec.imsi_duty_tm = Util.checkString(rset4.getString("imsi_duty_tm"));
			rec.imsi_pay_amt = Util.checkString(rset4.getString("imsi_pay_amt"));
			this.curlist5.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(11);
		while(rset5.next()){
			HD_INFO_2500_LCURLIST6Record rec = new HD_INFO_2500_LCURLIST6Record();
			rec.group_month = Util.checkString(rset5.getString("group_month"));
			rec.faml_emp_cnt = Util.checkString(rset5.getString("faml_emp_cnt"));
			rec.fmal_duty_dds = Util.checkString(rset5.getString("fmal_duty_dds"));
			rec.fmal_duty_tm = Util.checkString(rset5.getString("fmal_duty_tm"));
			rec.fmal_pay_amt = Util.checkString(rset5.getString("fmal_pay_amt"));
			this.curlist6.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_INFO_2500_LDataSet ds = (HD_INFO_2500_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_INFO_2500_LCURLISTRecord curlistRec = (HD_INFO_2500_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		HD_INFO_2500_LCURLIST2Record curlist2Rec = (HD_INFO_2500_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		HD_INFO_2500_LCURLIST3Record curlist3Rec = (HD_INFO_2500_LCURLIST3Record)ds.curlist3.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist4.size(); i++){
		HD_INFO_2500_LCURLIST4Record curlist4Rec = (HD_INFO_2500_LCURLIST4Record)ds.curlist4.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist5.size(); i++){
		HD_INFO_2500_LCURLIST5Record curlist5Rec = (HD_INFO_2500_LCURLIST5Record)ds.curlist5.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist6.size(); i++){
		HD_INFO_2500_LCURLIST6Record curlist6Rec = (HD_INFO_2500_LCURLIST6Record)ds.curlist6.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist2()%>
<%= ds.getCurlist3()%>
<%= ds.getCurlist4()%>
<%= ds.getCurlist5()%>
<%= ds.getCurlist6()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.group_month%>
<%= curlistRec.emp_cnt%>
<%= curlistRec.fix_labr_dds%>
<%= curlistRec.no_duty_dds%>
<%= curlistRec.paid_duty_dds%>
<%= curlistRec.fix_labr_tm%>
<%= curlistRec.paid_duty_tm%>
<%= curlistRec.tot_pay_saly_sum%>
<%= curlistRec.rgla_saly_sum%>
<%= curlistRec.add_saly_sum%>
<%= curlistRec.etc_saly_amt_sum%>
<%= curlist2Rec.group_month%>
<%= curlist2Rec.imsi_emp_cnt%>
<%= curlist2Rec.imsi_duty_dt%>
<%= curlist2Rec.imsi_duty_tm%>
<%= curlist2Rec.imsi_pay_amt%>
<%= curlist3Rec.group_month%>
<%= curlist3Rec.faml_emp_cnt%>
<%= curlist3Rec.fmal_duty_dds%>
<%= curlist3Rec.fmal_duty_tm%>
<%= curlist3Rec.fmal_pay_amt%>
<%= curlist4Rec.group_month%>
<%= curlist4Rec.emp_cnt%>
<%= curlist4Rec.fix_labr_dds%>
<%= curlist4Rec.no_duty_dds%>
<%= curlist4Rec.paid_duty_dds%>
<%= curlist4Rec.fix_labr_tm%>
<%= curlist4Rec.paid_duty_tm%>
<%= curlist4Rec.tot_pay_saly_sum%>
<%= curlist4Rec.rgla_saly_sum%>
<%= curlist4Rec.add_saly_sum%>
<%= curlist4Rec.etc_saly_amt_sum%>
<%= curlist5Rec.group_month%>
<%= curlist5Rec.imsi_emp_cnt%>
<%= curlist5Rec.imsi_duty_dt%>
<%= curlist5Rec.imsi_duty_tm%>
<%= curlist5Rec.imsi_pay_amt%>
<%= curlist6Rec.group_month%>
<%= curlist6Rec.faml_emp_cnt%>
<%= curlist6Rec.fmal_duty_dds%>
<%= curlist6Rec.fmal_duty_tm%>
<%= curlist6Rec.fmal_pay_amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jan 05 16:17:17 KST 2011 */