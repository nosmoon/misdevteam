/***************************************************************************************************
* ���ϸ� : SP_PS_S_RDRINFO.java
* ����-���ڹ�ȣ�� ������ȸ 
* �ۼ����� : 2004-03-08
* �ۼ��� : ���ȣ 
***************************************************************************************************/
/***************************************************************************************************
* �������� : �������� �ڵ� �� �������� �ڵ�� ���� ���� ��� �߰�
* ������ :  ����ǥ
* �������� : 2004-04-17
* ��� : ��
***************************************************************************************************/


package chosun.ciis.ps.pbs.common.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.common.dm.*;
import chosun.ciis.ps.pbs.common.rec.*;

/**
 * ����-���ڹ�ȣ�� ������ȸ  
 *
 */


public class PS_S_RDRINFODataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String rdr_no;
	public String medicd;
	public String termsubsno;
	public String rdrnm;
	public String medinm;
	public String bocd;
	public String bonm;

	public PS_S_RDRINFODataSet(){}
	public PS_S_RDRINFODataSet(String errcode, String errmsg, String rdr_no, String medicd, String termsubsno, String rdrnm, String medinm, String bocd, String bonm){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.rdr_no = rdr_no;
		this.medicd = medicd;
		this.termsubsno = termsubsno;
		this.rdrnm = rdrnm;
		this.medinm = medinm;
		this.bocd = bocd;
		this.bonm = bonm;
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

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
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

	public String getBocd(){
		return this.bocd;
	}

	public String getBonm(){
		return this.bonm;
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
		this.bocd = Util.checkString(cstmt.getString(12));
		this.bonm = Util.checkString(cstmt.getString(13));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	PS_S_RDRINFODataSet ds = (PS_S_RDRINFODataSet)request.getAttribute("ds");
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
<%= ds.getBocd()%>
<%= ds.getBonm()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon May 17 15:14:12 KST 2004 */