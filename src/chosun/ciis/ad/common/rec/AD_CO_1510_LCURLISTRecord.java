/***************************************************************************************************
* 파일명 : .java
* 기능 : 거래처인물정보
* 작성일자 : 2010.07.14
* 작성자 : KBS
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/
package chosun.ciis.ad.common.rec;

public class AD_CO_1510_LCURLISTRecord extends java.lang.Object implements java.io.Serializable
{
	public String dlco_no;
	public String dlco_nm;
	public String cust_seq;
	public String cust_name;
	public String department;
	public String position;
	public String mobile1;
	public String address;
	public String chg_dt_tm;
	public String incumbent_yn;
	
	public AD_CO_1510_LCURLISTRecord(){}

	public void setDlcoNo(String dlco_no)
	{
		this.dlco_no = dlco_no;
	}
	public void setDlcoNm(String dlco_nm)
	{
		this.dlco_nm = dlco_nm;
	}
	public void setCustSeq(String cust_seq)
	{
		this.cust_seq = cust_seq;
	}
	public void setCustName(String cust_name)
	{
		this.cust_name = cust_name;
	}
	public void setDepartment(String department)
	{
		this.department = department;
	}
	public void setPosition(String position)
	{
		this.position = position;
	}
	public void setMobile1(String mobile1)
	{
		this.mobile1 = mobile1;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}
	public void setChgDtTm(String chg_dt_tm)
	{
		this.chg_dt_tm = chg_dt_tm;
	}
	public void setIncumbentYn(String incumbent_yn)
	{
		this.incumbent_yn = incumbent_yn;
	}

	public String getDlcoNo()
	{
		return this.dlco_no;
	}
	public String getDlcoNm()
	{
		return this.dlco_nm;
	}
	public String getCustSeq()
	{
		return this.cust_seq;
	}
	public String getCustName()
	{
		return this.cust_name;
	}
	public String getDepartment()
	{
		return this.department;
	}
	public String getPosition()
	{
		return this.position;
	}
	public String getMobile1()
	{
		return this.mobile1;
	}
	public String getAddress()
	{
		return this.address;
	}
	public String getChgDtTm()
	{
		return this.chg_dt_tm;
	}
	public String getIncumbentYn()
	{
		return this.incumbent_yn;
	}
}

/* 작성시간 : Thu Jul 02 17:25:07 KST 2009 */