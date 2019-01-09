/***************************************************************************************************
* ���ϸ� : .java
* ��� : �ڱݰ���-�����������ε��
* �ۼ����� : 2009-02-19
* �ۼ��� : �����
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.fc.func.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.rec.*;

/**
 * �ڱݰ���-�����������ε��
 */


public class FC_FUNC_1032_IDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String row_no;
	public String slip_occr_dt;
	public String slip_clsf_cd;
	public String slip_seq;

	public FC_FUNC_1032_IDataSet(){}
	public FC_FUNC_1032_IDataSet(String errcode, String errmsg, String row_no, String slip_occr_dt, String slip_clsf_cd, String slip_seq){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.row_no = row_no;
		this.slip_occr_dt = slip_occr_dt;
		this.slip_clsf_cd = slip_clsf_cd;
		this.slip_seq = slip_seq;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setRow_no(String row_no){
		this.row_no = row_no;
	}

	public void setSlip_occr_dt(String slip_occr_dt){
		this.slip_occr_dt = slip_occr_dt;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setSlip_seq(String slip_seq){
		this.slip_seq = slip_seq;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getRow_no(){
		return this.row_no;
	}

	public String getSlip_occr_dt(){
		return this.slip_occr_dt;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getSlip_seq(){
		return this.slip_seq;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.row_no = Util.checkString(cstmt.getString(22));
		this.slip_occr_dt = Util.checkString(cstmt.getString(23));
		this.slip_clsf_cd = Util.checkString(cstmt.getString(24));
		this.slip_seq = Util.checkString(cstmt.getString(25));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	FC_FUNC_1032_IDataSet ds = (FC_FUNC_1032_IDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getRow_no()%>
<%= ds.getSlip_occr_dt()%>
<%= ds.getSlip_clsf_cd()%>
<%= ds.getSlip_seq()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Feb 13 20:08:11 KST 2009 */