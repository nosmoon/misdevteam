/***************************************************************************************************
 * ���ϸ�   : PB_S_RDRINFO_PARTDataSet.java
 * ���     : ����-�ʰ��Ա�ó�� ���������� �Ϻκ� ã��
 * �ۼ����� : 2004-03-31
 * �ۼ���   : ����
 **************************************************************************************************/
 /**************************************************************************************************
 * �������� :
 * ������   :
 * �������� :
 * ���     :
 **************************************************************************************************/


package chosun.ciis.ps.pbs.bill.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.bill.dm.*;
import chosun.ciis.ps.pbs.bill.rec.*;

/**
 * ����-�ʰ��Ա�ó�� ���������� �Ϻκ� ã��
 */

public class PB_S_RDRINFO_PARTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String rdr_no;
	public String medicd;
	public String termsubsno;
	public String rdrnm;
	public String medinm;
	public String subsfrser_no;
	public String substoser_no;

	public PB_S_RDRINFO_PARTDataSet(){}
	public PB_S_RDRINFO_PARTDataSet(String errcode, String errmsg, String rdr_no, String medicd, String termsubsno, String rdrnm, String medinm, String subsfrser_no, String substoser_no){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.rdr_no = rdr_no;
		this.medicd = medicd;
		this.termsubsno = termsubsno;
		this.rdrnm = rdrnm;
		this.medinm = medinm;
		this.subsfrser_no = subsfrser_no;
		this.substoser_no = substoser_no;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setTermsubsno(String termsubsno){
		this.termsubsno = termsubsno;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setSubsfrser_no(String subsfrser_no){
		this.subsfrser_no = subsfrser_no;
	}

	public void setSubstoser_no(String substoser_no){
		this.substoser_no = substoser_no;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getTermsubsno(){
		return this.termsubsno;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public String getSubsfrser_no(){
		return this.subsfrser_no;
	}

	public String getSubstoser_no(){
		return this.substoser_no;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.rdr_no = Util.checkString(cstmt.getString(7));
		this.medicd = Util.checkString(cstmt.getString(8));
		this.termsubsno = Util.checkString(cstmt.getString(9));
		this.rdrnm = Util.checkString(cstmt.getString(10));
		this.medinm = Util.checkString(cstmt.getString(11));
		this.subsfrser_no = Util.checkString(cstmt.getString(12));
		this.substoser_no = Util.checkString(cstmt.getString(13));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	PB_S_RDRINFO_PARTDataSet ds = (PB_S_RDRINFO_PARTDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getRdr_no()%>
<%= ds.getMedicd()%>
<%= ds.getTermsubsno()%>
<%= ds.getRdrnm()%>
<%= ds.getMedinm()%>
<%= ds.getSubsfrser_no()%>
<%= ds.getSubstoser_no()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Mar 31 19:08:53 KST 2004 */