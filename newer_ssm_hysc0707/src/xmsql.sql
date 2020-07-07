/*==============================================================*/
/* Database name:  slsaledb                                     */
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2020/7/7 13:38:04                            */
/*==============================================================*/


/*==============================================================*/
/* Table: BASICS_PARAMETER                                      */
/*==============================================================*/
create table BASICS_PARAMETER
(
   ID                   varchar2(32) not null,
   NAME                 varchar2(50),
   CODE                 varchar2(20),
   VALUE                varchar2(50),
   DESCRIPTION          varchar2(200),
   DR                   varchar2(10),
   primary key (ID)
);

--alter table BASICS_PARAMETER  'BASICS_PARAMETER';

/*==============================================================*/
/* Table: INFO_ANNEXES                                          */
/*==============================================================*/
create table INFO_ANNEXES
(
   ID                   varchar2(32) not null,
   INFO_ID              varchar2(32),
   NAME                 varchar2(60),
   URL                  varchar2(50),
   STATE                varchar2(20),
   TYPE                 varchar2(32),
   UPLOAD_TIME          date default NULL,
   SIZES                 number(8,0) default NULL,
   primary key (ID)
);

--alter table INFO_ANNEXES  'INFO_ANNEXES';

/*==============================================================*/
/* Table: INVENTORY                                             */
/*==============================================================*/
create table INVENTORY
(
   ID                   varchar2(32) not null,
   GOODS_ID             varchar2(32),
   NUM                  number(8,0) default NULL,
   STATE                varchar2(10),
   primary key (ID)
);

--alter table INVENTORY  'INVENTORY';

/*==============================================================*/
/* Table: MULTI_LAN                                             */
/*==============================================================*/
create table MULTI_LAN
(
   ELEMENT_ID           varchar2(100) not null,
   PAGE_PATH            varchar2(300),
   SCN                  varchar2(3000),
   TCN                  varchar2(3000),
   EN                   varchar2(3000),
   JP                   varchar2(3000),
   KR                   varchar2(3000),
   FR                   varchar2(3000),
   RA                   varchar2(3000),
   primary key (ELEMENT_ID)
);

--alter table MULTI_LAN  '���������ݱ�
--MULTI_LAN';

/*==============================================================*/
/* Table: ORDER_INFO                                            */
/*==============================================================*/
create table ORDER_INFO
(
   ORDER_ID             varchar2(32) not null,
   LIST_ID              varchar2(32),
   ORDER_TIME           date default NULL,
   ORDER_SN             varchar2(60),
   PICK_USER_ID         varchar2(32),
   REPEAT_PV            number(12,2) default NULL,
   BASE_PV              number(12,2) default NULL,
   SERVICE_FEE          number(12,2) default NULL,
   SHIP_FRE             number(12,2) default NULL,
   TAX                  number(12,2) default NULL,
   COUNTRY              varchar2(50),
   TEL                  varchar2(50),
   MOBILE               varchar2(50),
   EMAIL                varchar2(50),
   USER_ADDRESS         varchar2(300),
   POSTCODE             varchar2(30),
   STAT                 number(6,0) default NULL,
   SHIP_TYPE            varchar2(60),
   SHIP_NUM             varchar2(60),
   SHIP_TIME            date default NULL ,
   RECEIVE_TIME         date default NULL ,
   SHIP_NOTE            varchar2(300),
   buy_user_id          varchar2(32),
   primary key (ORDER_ID)
);

--alter table ORDER_INFO  '�û�������¼��
--ORDER_INFO';

/*==============================================================*/
/* Table: ORDER_LIST                                            */
/*==============================================================*/
create table ORDER_LIST
(
   LIST_ID              varchar2(32) not null,
   GOODS_ID             varchar2(32),
   GOODS_SN             varchar2(60),
   GOODS_NAME           varchar2(100),
   GOODS_FORMAT         varchar2(100),
   GOODS_NUM            number(9,0) default NULL ,
   EACH_PRICE           number(12,2) default NULL ,
   SUM_PRICE            number(12,2) default NULL ,
   DISCOUNT             number(6,4) default NULL ,
   REAL_PRICE           number(12,2) default NULL ,
   CURRENCY             varchar2(60),
   REAL_PV              number(12,2) default NULL ,
   PV_RATE              number(6,4) default NULL ,
   primary key (LIST_ID)
);

--alter table ORDER_LIST  '�û�������Ʒ��
--ORDER_LIST';

/*==============================================================*/
/* Table: USER_ACCOUNT_201312                                   */
/*==============================================================*/
create table USER_ACCOUNT_201312
(
   ACCOUNT_ID           varchar2(32) not null,
   USER_ID              varchar2(32),
   ACCOUNT_DATE         date default NULL ,
   STAT                 number(6,0) default NULL ,
   BASE_IN              number(12,2) default NULL  ,
   BASE_OUT             number(12,2) default NULL  ,
   BASE_BALANCE         number(6,4) default NULL  ,
   REPEAT_IN            number(12,2) default NULL ,
   REPEAT_OUT           number(12,2) default NULL  ,
   REPEAT_BALANCE       number(12,2) default NULL  ,
   FREE_PV              number(12,2) default NULL  ,
   ALREADY_PV           number(12,2) default NULL  ,
   BUY_PV               number(12,2) default NULL  ,
   primary key (ACCOUNT_ID)
);

--alter table USER_ACCOUNT_201312  '�û����˱�(ÿ��һ��)
--USER_ACCOUNT_201312';

/*==============================================================*/
/* Table: USER_ACCOUNT_LOG_201312                               */
/*==============================================================*/
create table USER_ACCOUNT_LOG_201312
(
   ACCOUNT_LOG_ID       varchar2(32) not null,
   USER_ID              varchar2(32),
   ACTION_TIME          date default NULL,
   ACTION_DESC          varchar2(300),
   ACTION_TYPE          number(6,0) default NULL  ,
   BASE_IN              number(12,2) default NULL  ,
   BASE_OUT             number(12,2) default NULL  ,
   BASE_BALANCE         number(6,4) default NULL  ,
   REPEAT_IN            number(12,2) default NULL  ,
   REPEAT_OUT           number(12,2) default NULL  ,
   REPEAT_BALANCE       number(12,2) default NULL  ,
   primary key (ACCOUNT_LOG_ID)
);

--alter table USER_ACCOUNT_LOG_201312  '�û�������ϸ��(ÿ��һ��)
--USER_ACCOUNT_LOG_201312';

/*==============================================================*/
/* Table: USER_BUY                                              */
/*==============================================================*/
create table USER_BUY
(
   BUY_ID               varchar2(32) not null,
   BUY_TIME             date default NULL  ,
   BONUS_USER_ID        varchar2(32),
   USER_ID              varchar2(32),
   BUY_PV               number(12,2) default NULL  ,
   BONUS_RATE           number(6,4) default NULL  ,
   BONUS_PV             number(12,2) default NULL  ,
   primary key (BUY_ID)
);

--alter table USER_BUY  '�û��ظ����Ѽ�¼��
--USER_BUY';

/*==============================================================*/
/* Table: USER_BUY_BONUS                                        */
/*==============================================================*/
create table USER_BUY_BONUS
(
   BUY_BONUS_ID         varchar2(32) not null,
   BONUS_MONTH          varchar2(32),
   CAL_TIME             date default NULL ,
   BONUS_USER_ID        varchar2(32),
   BUY_PV               number(12,2) default NULL ,
   BONUS_RATE           number(6,4) default NULL ,
   BONUS_PV             number(12,2) default NULL ,
   primary key (BUY_BONUS_ID)
);

--alter table USER_BUY_BONUS  '�û��ظ������½�����¼��USER_BUY_BONUS';

/*==============================================================*/
/* Table: USER_CASH                                             */
/*==============================================================*/
create table USER_CASH
(
   CASH_ID              varchar2(32) not null,
   CASH_TIME            date default NULL,
   CASH_NUM             varchar2(60),
   USER_ID              varchar2(32),
   CASH_PV              number(12,2) default NULL,
   CURRENCY             varchar2(60),
   PV_RATE              number(6,4) default NULL ,
   CASH_MONEY           number(12,2) default NULL ,
   NOTE                 varchar2(300),
   FEE                  number(12,2) default NULL ,
   TAX                  number(12,2) default NULL ,
   OTHER_FEE            number(12,2) default NULL ,
   BANK_NAME            varchar2(300),
   BANK_BRANCE          varchar2(300),
   BANK_ACCOUNT         varchar2(300),
   ACCOUNT_NAME         varchar2(60),
   STAT                 number(6,0) default NULL ,
   CREDITED_MONEY       number(12,2) default NULL ,
   CREDITED_TIME        date default NULL ,
   OPERATOR             varchar2(32),
   primary key (CASH_ID)
);

--alter table USER_CASH  '�û�PV���ּ�¼��
--USER_CASH';

/*==============================================================*/
/* Table: USER_PAIR_201312                                      */
/*==============================================================*/
create table USER_PAIR_201312
(
   PAIR_ID              varchar2(32) not null,
   myDATE                 date default NULL ,
   BONUS_USER_ID        varchar2(32),
   LEFT_USER            number(9,0) default NULL  ,
   RIGHT_USER           number(9,0) default NULL  ,
   LEFT_KEEP            number(9,0) default NULL  ,
   RIGHT_KEEP           number(9,0) default NULL  ,
   EACH_PV              number(12,2) default NULL ,
   SUM_PAIR_PV          number(12,2) default NULL  ,
   BONUS_RATE           number(6,4) default NULL  ,
   BONUS_PV             number(12,2) default NULL  ,
   primary key (PAIR_ID)
);

--alter table USER_PAIR_201312  '�û�������¼��(ÿ��һ��)
--USER_PAIR_201312';

/*==============================================================*/
/* Table: USER_PLACE                                            */
/*==============================================================*/
create table USER_PLACE
(
   PLACE_ID             varchar2(32) not null,
   PLACE_TIME           date default NULL ,
   BONUS_USER_ID        varchar2(32),
   USER_ID              varchar2(32),
   BUY_PV               number(12,2) default NULL ,
   BONUS_RATE           number(6,4) default NULL ,
   BONUS_PV             number(12,2) default NULL ,
   primary key (PLACE_ID)
);

--alter table USER_PLACE  '�û����ü�¼��
--USER_PLACE';

/*==============================================================*/
/* Table: USER_POnumber                                            */
/*==============================================================*/
create table USER_POnumber
(
   POnumber_ID             varchar2(32) not null,
   BUY_TIME             date default NULL ,
   BONUS_USER_ID        varchar2(32),
   USER_ID              varchar2(32),
   BUY_PV               number(12,2) default NULL ,
   BONUS_RATE           number(6,4) default NULL ,
   BONUS_PV             number(12,2) default NULL ,
   primary key (POnumber_ID)
);

--alter table USER_POnumber  '�û��������ѽ�����¼��
--USER_POnumber';

/*==============================================================*/
/* Table: USER_POnumber_GOODS                                      */
/*==============================================================*/
create table USER_POnumber_GOODS
(
   POnumber_GOODS_ID       varchar2(32) not null,
   PICK_TIME            date default NULL ,
   USER_ID              varchar2(32),
   BUY_PV               number(12,2) default NULL ,
   ORDER_ID             varchar2(32),
   primary key (POnumber_GOODS_ID)
);
--alter table USER_POnumber_GOODS  '�û����������¼��
--USER_POnumber_GOODS';

/*==============================================================*/
/* Table: USER_RECHARGE                                         */
/*==============================================================*/
create table USER_RECHARGE
(
   RECHARGE_ID          varchar2(32) not null,
   RECHARGE_TIME        date default NULL ,
   RECHARGE_NUM         varchar2(60),
   USER_ID              varchar2(32),
   CURRENCY             varchar2(32),
   RECHARGE_MONEY       number(12,2) default NULL ,
   NOTE                 varchar2(300),
   CREDITED_MONEY       number(12,2) default NULL ,
   CREDITED_TIME        date default NULL ,
   AUDIT_USER           varchar2(32),
   PV_RATE              number(6,4) default NULL  ,
   PV                   number(12,2) default NULL ,
   BANK_NAME            varchar2(300),
   BANK_ACCOUNT         varchar2(300),
   PLATFORM             varchar2(300),
   PARAM                varchar2(1000),
   primary key (RECHARGE_ID)
);

--alter table USER_RECHARGE  '�û�����ֵ��¼��
--USER_RECHARGE';

/*==============================================================*/
/* Table: USER_REFER                                            */
/*==============================================================*/
create table USER_REFER
(
   REFER_LOG_ID         varchar2(32) not null,
   REFER_TIME           date default NULL  ,
   USER_ID              varchar2(32),
   REFER_ID             varchar2(32),
   BUY_PV               number(12,2) default NULL  ,
   BONUS_RATE           number(6,4) default NULL ,
   BONUS_PV             number(12,2) default NULL,
   primary key (REFER_LOG_ID)
);

--alter table USER_REFER  '�û��Ƽ���¼��
--USER_REFER';

/*==============================================================*/
/* Table: affiche                                               */
/*==============================================================*/
create table affiche
(
   id                   number not null,
   code                 varchar2(100),
   title                varchar2(200),
   content              varchar2(1024),
   publisher            varchar2(60),
   publishTime          date default NULL ,
   startTime            date default NULL ,
   endTime              date default NULL ,
   primary key (id)
);

--alter table affiche  'affiche';
insert  into affiche(id,code,title,content,publisher,publishTime,startTime,endTime) values 
(34,'����1','����1','<font face=\"Arial, Verdana\" size=\"2\">����<b><i>1����1����1����1</i>
</b>����1����<span style=\"background-color: rgb(204, 0, 0);\">1����1����1</span>����1����1����1����1����1����1</font>','admin',to_date('2014-04-10 14:56:24','yyyy-MM-dd hh24:mi:ss'),to_date('2014-04-10 00:00:00','yyyy-MM-dd hh24:mi:ss'),to_date('2014-04-19 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into affiche(id,code,title,content,publisher,publishTime,startTime,endTime) values 
(35,'����2','����2','<font face=\"Arial, Verdana\" size=\"2\">����2����2����2����2����2����2����2����2����2����2</font>','admin',to_date('2014-04-10 14:52:33','yyyy-MM-dd hh24:mi:ss'),to_date('2014-04-9 00:00:00','yyyy-MM-dd hh24:mi:ss'),to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into affiche(id,code,title,content,publisher,publishTime,startTime,endTime) values 
(36,'����3','����3','<font face=\"Arial, Verdana\" size=\"2\">����3����3����3����3����3����3����3</font>','admin',to_date('2014-04-10 14:52:33','yyyy-MM-dd hh24:mi:ss'),to_date('2014-04-9 00:00:00','yyyy-MM-dd hh24:mi:ss'),to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into affiche(id,code,title,content,publisher,publishTime,startTime,endTime) values 
(37,'����3','����4','<font face=\"Arial, Verdana\" size=\"2\">����4����4����4����4����4����4����4����4����4</font>','admin',to_date('2014-04-10 14:52:33','yyyy-MM-dd hh24:mi:ss'),to_date('2014-04-9 00:00:00','yyyy-MM-dd hh24:mi:ss'),to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into affiche(id,code,title,content,publisher,publishTime,startTime,endTime) values 
(38,'����5','����5','<font face=\"Arial, Verdana\" size=\"2\">����5����5����5����5����5����5����5</font>','admin',to_date('2014-04-10 14:52:33','yyyy-MM-dd hh24:mi:ss'),to_date('2014-04-9 00:00:00','yyyy-MM-dd hh24:mi:ss'),to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));

/*==============================================================*/
/* Table: au_authority                                          */
/*==============================================================*/
create table au_authority
(
   id                   number(20) not null  ,
   roleId               number(20) default NULL  ,
   functionId           number(20) default NULL  ,
   userTypeId           number(20) default NULL  ,
   creationTime         date default NULL  ,
   createdBy            varchar2(100),
   primary key (id)
);
--alter table au_authority  'Ȩ��_��ԴȨ�ޱ�to_date('2014-04-10 14:52:33','yyyy-MM-dd hh24:mi:ss'),to_date('2014-04-9 00:00:00','yyyy-MM-dd hh24:mi:ss'),to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss')
--au_authority';
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1534,1,87,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1533,1,86,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1532,1,85,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1531,1,84,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1530,1,83,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1529,1,82,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1528,1,81,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1527,1,80,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1526,1,79,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1685,2,92,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1525,1,78,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1635,25,37,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1634,25,16,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1633,25,15,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1632,25,14,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1631,25,13,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1630,25,2,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1524,1,77,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1523,1,76,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1522,1,75,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1521,1,74,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1520,1,73,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1519,1,72,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1518,1,71,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1517,1,70,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1516,1,69,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1515,1,68,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1514,1,67,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1684,2,91,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1683,2,76,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1682,2,75,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1681,2,74,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1680,2,73,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1679,2,72,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1539,1,92,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1538,1,91,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1537,1,90,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1536,1,89,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1535,1,88,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1650,25,72,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1651,25,73,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1652,25,74,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1653,25,75,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1654,25,76,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1655,1,93,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1643,25,65,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1644,25,66,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1645,25,67,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1646,25,68,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1647,25,69,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1648,25,70,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1649,25,71,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1513,1,66,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1512,1,65,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1511,1,64,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1510,1,63,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1509,1,62,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1508,1,61,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1507,1,60,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1506,1,59,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1505,1,58,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1504,1,57,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1503,1,56,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1502,1,55,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1501,1,54,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1500,1,53,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1499,1,52,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1498,1,51,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1497,1,50,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1496,1,49,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1495,1,48,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1494,1,47,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1493,1,46,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1492,1,45,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1491,1,44,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1490,1,43,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1489,1,42,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1488,1,41,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1487,1,40,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1486,1,39,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1485,1,38,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1484,1,37,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1483,1,36,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1482,1,35,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1481,1,34,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1480,1,33,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1479,1,32,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1478,1,31,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1477,1,30,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1476,1,29,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1475,1,28,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values
(1474,1,27,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');

--insert  into au_authority(id,roleId,functionId,userTypeId,creationTime,createdBy) values(1640,25,62,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin'),(1661,2,16,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin'),(1660,2,15,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin'),(1659,2,14,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin'),(1658,2,13,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin'),(1657,2,6,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin'),(1656,2,2,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin'),(1687,26,6,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin'),(1688,26,17,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin'),(1689,26,18,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin'),(1690,26,37,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin'),(1691,26,38,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin'),(1692,26,39,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin'),(1693,26,40,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin'),(1694,26,41,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin'),(1695,26,77,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin'),(1696,26,78,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin'),(1697,26,79,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin'),(1698,26,80,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin'),(1699,26,81,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin'),(1700,26,82,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin'),(1701,26,83,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin'),(1702,26,84,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin'),(1703,26,85,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin'),(1704,26,86,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin'),(1705,26,87,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');

/*==============================================================*/
/* Table: au_function                                           */
/*==============================================================*/
create table au_function
(
   id                   number(20) not null,
   functionCode         varchar2(50),
   functionName         varchar2(50),
   funcUrl              varchar2(255),
   parentId             number(20) default NULL,
   creationTime         date default NULL ,
   primary key (id)
);

--alter table au_function  'au_function';
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values (1,'backendmanage','��̨����',NULL,0,NULL);
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(2,'membermanage','��Ա����',NULL,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(3,'ebank','��������',NULL,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(4,'shoppingmanage','�������',NULL,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(5,'infosearch','��Ϣ��ѯ',NULL,0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(6,'informanage','��Ϣ����','',0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(7,'userlist','�û�����','/backend/userlist.html',1,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(8,'rolelist','��ɫ����','/backend/rolelist.html',1,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(9,'authoritymanage','Ȩ�޹���','/backend/authoritymanage.html',1,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(10,'goodsinfolist','��Ʒ����','/backend/goodsinfolist.html',1,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(11,'goodspacklist','��Ʒ�ײ͹���','/backend/goodspacklist.html',1,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(12,'datadictionary','�����ֵ�','/backend/dicmanage.html',1,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(13,'registmember','ע���»�Ա','/member/registmember.html',2,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(14,'memberlist','�»�Ա����','/member/memberlist.html',2,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(15,'modifypersonalinfo','�޸ı�������','/member/modifypersonalinfo.html',2,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(16,'modifypersonalpwd','�޸ı�������','/member/modifypersonalpwd.html',2,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(17,'affiche','�������','/informanage/affiche.html',6,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(18,'information','��Ѷ����','/informanage/information.html',6,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(19,'download','��������','/informanage/downloadcenter.html',6,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(20,'messagelist','���Թ���','/message/messagelist.html',6,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(21,'mymessage','�ҵ�����','/message/mymessage.html',6,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(22,'getgoodsinfo','�鿴��Ʒ��Ϣ','/backend/getgoodsinfo.html',10,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(23,'modifystate','�޸���Ʒ�ϼ�״̬','/backend/modifystate.html',10,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(24,'goodsSNisexit','��Ʒ����ظ��ж�','/backend/goodsSNisexit.html',10,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(25,'modifygoodsinfo','�޸���Ʒ��Ϣ','/backend/modifygoodsinfo.html',10,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(26,'delgoodsinfo','ɾ����Ʒ','/backend/delgoodsinfo.html',10,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(27,'addgoodsinfo','�����Ʒ','/backend/addgoodsinfo.html',10,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(28,'modifygoodspackstate','�޸������ײ����¼�״̬','/backend/modifygoodspackstate.html',11,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(29,'viewgoodspack','�鿴�����ײ���Ϣ','/backend/viewgoodspack.html',11,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(30,'addgoodspack','��������ײ�','/backend/addgoodspack.html',11,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(31,'modifygoodspack','�޸������ײ�','/backend/modifygoodspack.html',11,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(32,'saveaddgoodspack','������ӵ���Ʒ�ײ�','/backend/saveaddgoodspack.html',11,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(33,'savemodifygoodspack','�޸������ײ���Ϣ','/backend/savemodifygoodspack.html',11,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(34,'goodspackcodeisexit','�����ײ�code�ظ��ж�','/backend/goodspackcodeisexit.html',11,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(35,'delgoodspack','ɾ�������ײ�','/backend/delgoodspack.html',11,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(36,'goodslist','�����ײ��е���Ʒ�б�','/backend/goodslist.html',11,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(37,'portalafficheList','��̨��ҳ�����б�ҳ��','/informanage/portalafficheList.html',999,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(38,'portalAfficheDetail','��̨��ҳ�����б�����������ҳ��','/informanage/portalAfficheDetail.html',999,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(39,'portalinfoList','��̨��ҳ��Ѷ�б�ҳ��','/informanage/portalinfoList.html',999,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(40,'portalInfoDetail','��̨��ҳ��Ѷ�б�����������ҳ��','/informanage/portalInfoDetail.html',999,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(41,'modifyPwd','��ҳhead�޸�����','/backend/modifyPwd.html',999,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(42,'adduser','����û�','/backend/adduser.html',7,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(43,'getuser','��ȡ�û�','/backend/getuser.html',7,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(44,'loadUserTypeList','��ȡ�û������б�','/backend/loadUserTypeList.html',7,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(45,'upload','�ϴ�ͼƬUrl','/backend/upload.html',7,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(46,'delpic','ɾ���ϴ����ͼƬ��URL','/backend/delpic.html',7,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(47,'modifyuser','�޸��û���Ϣ','/backend/modifyuser.html',7,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(48,'modifyRole','�޸Ľ�ɫ�Ƿ����ú��޸Ľ�ɫ��Ϣ','/backend/modifyRole.html',8,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(49,'addRole','���ӽ�ɫ','/backend/addRole.html',8,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(50,'delRole','ɾ����ɫ','/backend/delRole.html',8,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(51,'functions','��ȡ����Ȩ��','/backend/functions.html',9,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(52,'getAuthorityDefault','��ȡȨ�޻���','/backend/getAuthorityDefault.html',9,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(53,'modifyAuthority','�޸�Ȩ��','/backend/modifyAuthority.html',9,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(54,'addDic','��������ֵ�','/backend/addDic.html',12,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(55,'addDicSub','��������ֵ�ö������','/backend/addDicSub.html',12,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(56,'modifylDic','�޸������ֵ�����','/backend/modifylDic.html',12,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(57,'modifyDic','�޸������ֵ�ö������','/backend/modifyDic.html',12,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(58,'delMainDic','ɾ�������ֵ�','/backend/delMainDic.html',12,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(59,'delDic','ɾ�������ֵ�ö������','/backend/delDic.html',12,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(60,'typecodeisexit','���ʹ��벻���ظ���֤','/backend/typecodeisexit.html',12,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(61,'getJsonDic','��ȡ�����ֵ�ö������JSON','/backend/getJsonDic.html',12,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(62,'registmember','ע���»�Ա��һ��','/member/registmember.html',13,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(63,'saveregistmember','�ύע���»�Ա','/member/saveregistmember.html',13,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(64,'upload','�ϴ�ͼƬUrl','/backend/upload.html',13,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(65,'delpic','ɾ���ϴ����ͼƬ��URL','/backend/delpic.html',13,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(66,'logincodeisexit','�жϵ�¼Code�Ƿ��ظ�','/backend/logincodeisexit.html',13,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(67,'registok','ע��ɹ���Ϣ����','/member/registok.html',13,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(68,'getuser','��ȡ�û�','/backend/getuser.html',14,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(69,'logincodeisexit','�жϵ�¼Code�Ƿ��ظ�','/backend/logincodeisexit.html',14,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(70,'modifymember','�޸��»�Ա��Ϣ','/member/modifymember.html',14,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(71,'deluser','ɾ���»�Ա','/backend/deluser.html',14,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(72,'upload','�ϴ�ͼƬUrl','/backend/upload.html',15,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(73,'delpic','ɾ���ϴ����ͼƬ��URL','/backend/delpic.html',15,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(74,'savepersonalinfo','ִ���޸ı�������','/member/savepersonalinfo.html',15,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(75,'modifyPwd','ִ���޸ı�������','/backend/modifyPwd.html',16,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(76,'savesecondpwd','ִ���޸ı��˶�������','/member/savesecondpwd.html',16,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(77,'addAffiche','��ӹ���','/informanage/addAffiche.html',17,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(78,'viewAffiche','�鿴����','/informanage/viewAffiche.html',17,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(79,'modifyAffiche','�޸Ĺ���','/informanage/modifyAffiche.html',17,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(80,'delAffiche','ɾ������','/informanage/delAffiche.html',17,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(81,'modifyInfoState','�޸ķ���״̬','/informanage/modifyInfoState.html',18,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(82,'viewInfo','�鿴��Ѷ��Ϣ','/informanage/viewInfo.html',18,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(83,'modifyinformation','�޸���Ѷ��Ϣ','/informanage/modifyinformation.html',18,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(84,'upload','�ϴ���Ѷ�ļ�','/informanage/upload.html',18,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(85,'delInfoFile','ɾ����Ѷ���ļ�','/informanage/delInfoFile.html',18,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(86,'delInfo','ɾ����Ѷ','/informanage/delInfo.html',18,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(87,'addInformation','�����Ѷ��Ϣ','/informanage/addInformation.html',18,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(88,'getmessage','�鿴����','/message/getmessage.html',20,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(89,'replymessage','�ظ�����','/message/replymessage.html',20,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(90,'delmessage','ɾ������','/backend/delmessage.html',20,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(91,'addmessage','�������','/message/addmessage.html',21,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(92,'reply','��ʾ�ظ��б�','/message/reply.html',21,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
insert  into au_function(id,functionCode,functionName,funcUrl,parentId,creationTime) values 
(93,'registrule','�鿴ע������','/member/registrule.html',13,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));

/*==============================================================*/
/* Table: au_role                                               */
/*==============================================================*/
create table au_role
(
   id                   number(20) not null ,
   roleCode             varchar2(100),
   roleName             varchar2(100),
   createDate           date default NULL ,
   isStart              number(10) default NULL  ,
   createdBy            varchar2(100),
   primary key (id)
);

--alter table au_role  'Ȩ��_��ɫ��
--au_role';
insert  into au_role(id,roleCode,roleName,createDate,isStart,createdBy) values 
(1,'sl_role01','����Ա',to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),1,'admin');
insert  into au_role(id,roleCode,roleName,createDate,isStart,createdBy) values
(2,'sl_role02','��Ա',to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),1,'admin');
insert  into au_role(id,roleCode,roleName,createDate,isStart,createdBy) values
(26,'sl_role03','����',to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),1,'admin');

/*==============================================================*/
/* Table: au_user                                               */
/*==============================================================*/
create table au_user
(
   id                   number(20) not null,
   loginCode            varchar2(60),
   password             varchar2(60),
   password2            varchar2(60),
   userName             varchar2(100),
   sex                  varchar2(20),
   birthday             date default NULL ,
   cardType             varchar2(60),
   cardTypeName         varchar2(100),
   idCard               varchar2(100),
   country              varchar2(100),
   mobile               varchar2(20),
   email                varchar2(60),
   userAddress          varchar2(200),
   postCode             varchar2(20),
   createTime           date default NULL ,
   referId              number(20) default NULL ,
   referCode            varchar2(60),
   roleId               number(20) default NULL ,
   roleName             varchar2(60),
   userType             varchar2(60),
   userTypeName         varchar2(100),
   isStart              number(10) default NULL ,
   lastUpdate       date default NULL ,
   lastLognumberime        date default NULL ,
   bankAccount          varchar2(200),
   bankName             varchar2(200),
   accountHolder        varchar2(200),
   idCardPicPath        varchar2(200),
   bankPicPath          varchar2(200),
   primary key (id)
);

--alter table au_user  'au_user';

insert  into au_user(id,loginCode,password,password2,userName,sex,birthday,cardType,cardTypeName,idCard,country,mobile,email,userAddress,postCode,createTime,referId,referCode,roleId,roleName,userType,userTypeName,isStart,lastUpdate,lastLognumberime,bankAccount,bankName,accountHolder,idCardPicPath,bankPicPath) values 
(2,'admin','123456','123456','ϵͳ����Ա','Ů',to_date('2000-11-25','yyyy-MM-dd'),'1','���֤','123456','�й�','13522614019','123@hanlu.com','�����гɸ�·207�ű�������¥����111','121212',to_date('2000-11-25','yyyy-MM-dd'),1,'admin',1,'����Ա','','',1,to_date('2000-11-25','yyyy-MM-dd'),to_date('2000-11-25','yyyy-MM-dd'),'3423423432432','�й�����','�Ź�','/statics/uploadfiles/1396950060999_IDcard.jpg','/statics/uploadfiles/1396950267285_bank.jpg');
insert  into au_user(id,loginCode,password,password2,userName,sex,birthday,cardType,cardTypeName,idCard,country,mobile,email,userAddress,postCode,createTime,referId,referCode,roleId,roleName,userType,userTypeName,isStart,lastUpdate,lastLognumberime,bankAccount,bankName,accountHolder,idCardPicPath,bankPicPath) values 
(73,'JBIT','123456','123456','��������','',to_date('2000-11-25','yyyy-MM-dd'),'1','���֤','123456','�й�','123456','','','',to_date('2000-11-25','yyyy-MM-dd'),2,'admin',2,'��Ա','1','ע���Ա',1,to_date('2000-11-25','yyyy-MM-dd'),to_date('2000-11-25','yyyy-MM-dd'),'123456','��������','��������','/statics/uploadfiles/1397098771656_IDcard.jpg','/statics/uploadfiles/1397112341821_bank.jpg');

/*==============================================================*/
/* Table: data_dictionary                                       */
/*==============================================================*/
create table data_dictionary
(
   id                   number(20) not null ,
   typeCode             varchar2(100),
   typeName             varchar2(100),
   valueId              number(20) default NULL ,
   valueName            varchar2(100),
   primary key (id)
);

--alter table data_dictionary  'data_dictionary';
insert  into data_dictionary(id,typeCode,typeName,valueId,valueName) values
 (1,'CARD_TYPE','֤������',1,'���֤');
 insert  into data_dictionary(id,typeCode,typeName,valueId,valueName) values
 (2,'CARD_TYPE','֤������',2,'��ʻ֤');
 insert  into data_dictionary(id,typeCode,typeName,valueId,valueName) values
 (3,'CARD_TYPE','֤������',3,'����֤');
 insert  into data_dictionary(id,typeCode,typeName,valueId,valueName) values
 (4,'CARD_TYPE','֤������',4,'����');
 insert  into data_dictionary(id,typeCode,typeName,valueId,valueName) values
 (5,'USER_TYPE','�û�����',1,'ע���Ա');
 insert  into data_dictionary(id,typeCode,typeName,valueId,valueName) values
 (6,'USER_TYPE','�û�����',2,'��ͨ���ѻ�Ա');
 insert  into data_dictionary(id,typeCode,typeName,valueId,valueName) values
 (7,'USER_TYPE','�û�����',3,'VIP��Ա');
 insert  into data_dictionary(id,typeCode,typeName,valueId,valueName) values
 (8,'USER_TYPE','�û�����',4,'���˵�');
 insert  into data_dictionary(id,typeCode,typeName,valueId,valueName) values
 (9,'PACK_TYPE','�ײ�����',1,'�����ײ�');
 insert  into data_dictionary(id,typeCode,typeName,valueId,valueName) values
 (10,'PACK_TYPE','�ײ�����',2,'�����ײ�');
 insert  into data_dictionary(id,typeCode,typeName,valueId,valueName) values
 (11,'PACK_TYPE','�ײ�����',3,'�����ײ�');
 insert  into data_dictionary(id,typeCode,typeName,valueId,valueName) values
 (12,'FINANCE_ACTION','������',1,'����');
 insert  into data_dictionary(id,typeCode,typeName,valueId,valueName) values
 (13,'FINANCE_ACTION','������',2,'����');
 insert  into data_dictionary(id,typeCode,typeName,valueId,valueName) values
 (14,'FINANCE_ACTION','������',3,'ͬʱ');
 insert  into data_dictionary(id,typeCode,typeName,valueId,valueName) values
 (15,'ORDER_STATUS','����״̬',1,'���µ�');
 insert  into data_dictionary(id,typeCode,typeName,valueId,valueName) values
 (16,'ORDER_STATUS','����״̬',2,'��ȡ��');
 insert  into data_dictionary(id,typeCode,typeName,valueId,valueName) values
 (17,'ORDER_STATUS','����״̬',3,'�Ѹ���');
 insert  into data_dictionary(id,typeCode,typeName,valueId,valueName) values
 (18,'ORDER_STATUS','����״̬',4,'�����');
 insert  into data_dictionary(id,typeCode,typeName,valueId,valueName) values
 (19,'ORDER_STATUS','����״̬',5,'�ѷ���');
 insert  into data_dictionary(id,typeCode,typeName,valueId,valueName) values
 (20,'ORDER_STATUS','����״̬',6,'���ʹ�');
 insert  into data_dictionary(id,typeCode,typeName,valueId,valueName) values
 (21,'ORDER_STATUS','����״̬',7,'���ջ�');
 insert  into data_dictionary(id,typeCode,typeName,valueId,valueName) values
 (22,'ORDER_STATUS','����״̬',8,'���׳ɹ�');
 insert  into data_dictionary(id,typeCode,typeName,valueId,valueName) values
 (23,'ORDER_STATUS','����״̬',9,'����δ�ɹ�');
 insert  into data_dictionary(id,typeCode,typeName,valueId,valueName) values
 (24,'EXPRESS_TYPE','�������',1,'EMS');
 insert  into data_dictionary(id,typeCode,typeName,valueId,valueName) values
 (25,'EXPRESS_TYPE','�������',2,'˳����');
 insert  into data_dictionary(id,typeCode,typeName,valueId,valueName) values
 (26,'EXPRESS_TYPE','�������',3,'Բͨ���');
 insert  into data_dictionary(id,typeCode,typeName,valueId,valueName) values
 (27,'EXPRESS_TYPE','�������',4,'��ͨ���');
 insert  into data_dictionary(id,typeCode,typeName,valueId,valueName) values
 (28,'INFO_TYPE','��Ѷ����',1,'ͼƬ');
 insert  into data_dictionary(id,typeCode,typeName,valueId,valueName) values
 (29,'INFO_TYPE','��Ѷ����',2,'��Ƶ');
 insert  into data_dictionary(id,typeCode,typeName,valueId,valueName) values
 (30,'INFO_TYPE','��Ѷ����',3,'�ı�');
 insert  into data_dictionary(id,typeCode,typeName,valueId,valueName) values
 (31,'CASH_IN_STATUS','����״̬',1,'������');
 insert  into data_dictionary(id,typeCode,typeName,valueId,valueName) values
 (32,'CASH_IN_STATUS','����״̬',2,'�����');
 insert  into data_dictionary(id,typeCode,typeName,valueId,valueName) values
 (33,'CASH_IN_STATUS','����״̬',3,'δͨ��');
 insert  into data_dictionary(id,typeCode,typeName,valueId,valueName) values
 (34,'CASH_IN_STATUS','����״̬',4,'�ȴ���');
 insert  into data_dictionary(id,typeCode,typeName,valueId,valueName) values
 (35,'CASH_IN_STATUS','����״̬',5,'������');
 insert  into data_dictionary(id,typeCode,typeName,valueId,valueName) values
 (81,'INFOFILE_SIZE','�ϴ���Ѷ�ļ���С',1,'500000000');
 insert  into data_dictionary(id,typeCode,typeName,valueId,valueName) values
 (80,'PV_RATE','PVת����',1,'0.8');
 insert  into data_dictionary(id,typeCode,typeName,valueId,valueName) values
 (89,'BONUS_PV','��������',1,'200');
 insert  into data_dictionary(id,typeCode,typeName,valueId,valueName) values
 (88,'EACH_PV','ÿ��PV��',1,'400');
 insert  into data_dictionary(id,typeCode,typeName,valueId,valueName) values
 (87,'RECOMM_PV','�Ƽ�����PV',1,'400');
 insert  into data_dictionary(id,typeCode,typeName,valueId,valueName) values
 (86,'BONUS_RATE','�������',1,'5%');
 insert  into data_dictionary(id,typeCode,typeName,valueId,valueName) values
 (85,'CONVER_FORMULA','PV���㹫ʽ',1,'����PV ����PV');
 insert  into data_dictionary(id,typeCode,typeName,valueId,valueName) values
 (83,'FEE','������',1,'5%');
 insert  into data_dictionary(id,typeCode,typeName,valueId,valueName) values
 (84,'OTHER_FEE','��������',1,'10');
 insert  into data_dictionary(id,typeCode,typeName,valueId,valueName) values
 (82,'PERSONALFILE_SIZE','�ϴ��������ϸ�����С',1,'50000');

/*==============================================================*/
/* Table: goods_info                                            */
/*==============================================================*/
create table goods_info
(
   id                   number(20) not null ,
   goodsSN              varchar2(60),
   goodsName            varchar2(60),
   goodsFormat          varchar2(1024),
   marketPrice          number(10,2) default NULL  ,
   realPrice            number(10,2) default NULL  ,
   state                number(10) default NULL  ,
   note                 varchar2(1024),
   num                  number(20) default 0 ,
   unit                 varchar2(10),
   createTime           date default NULL ,
   lastUpdate       date default NULL ,
   createdBy            varchar2(20),
   primary key (id)
);

--alter table goods_info  '��Ʒ��
--goods_info';
insert  into goods_info(id,goodsSN,goodsName,goodsFormat,marketPrice,realPrice,state,note,num,unit,createTime,lastUpdate,createdBy)
 values (14,'001','����','<b><font size=\"5\">����<span style=\"background-color: rgb(255, 204, 51);\">������</span>ͬ��</font></b>',120,110,1,'',56,'��',to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');
 insert  into goods_info(id,goodsSN,goodsName,goodsFormat,marketPrice,realPrice,state,note,num,unit,createTime,lastUpdate,createdBy)
 values (15,'002','����','',150,100,1,'',56,'��',to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');

 insert  into goods_info(id,goodsSN,goodsName,goodsFormat,marketPrice,realPrice,state,note,num,unit,createTime,lastUpdate,createdBy)
 values (16,'003','ȹ��','',200,150,2,'����ͬ��',90,'��',to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),'admin');

/*==============================================================*/
/* Table: goods_pack                                            */
/*==============================================================*/
create table goods_pack
(
   id                   number(20) not null ,
   goodsPackName        varchar2(60),
   goodsPackCode        varchar2(60),
   typeId               number(20) default NULL ,
   typeName             varchar2(60),
   totalPrice           number(10,2) default NULL ,
   state                number(10) default NULL ,
   note                 varchar2(1024),
   num                  number(20) default 0 ,
   createdBy            varchar2(60),
   createTime           date default NULL ,
   lastUpdate       date default NULL ,
   primary key (id)
);

--alter table goods_pack  'goods_pack';
insert  into goods_pack(id,goodsPackName,goodsPackCode,typeId,typeName,totalPrice,state,note,num,createdBy,createTime,lastUpdate) values
 (20,'����ͬ��','001',1,'�����ײ�',260,1,'',100,'admin',to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));

/*==============================================================*/
/* Table: goods_pack_affiliated                                 */
/*==============================================================*/
create table goods_pack_affiliated
(
   id                   number(20) not null,
   goodsPackId          number(20) default NULL,
   goodsInfoId          number(20) default NULL,
   goodsNum             number(20) default NULL,
   primary key (id)
);

--alter table goods_pack_affiliated  'goods_pack_affiliated';
insert  into goods_pack_affiliated(id,goodsPackId,goodsInfoId,goodsNum) values (85,20,16,1);
insert  into goods_pack_affiliated(id,goodsPackId,goodsInfoId,goodsNum) values (84,20,14,1);

/*==============================================================*/
/* Table: information                                           */
/*==============================================================*/
create table information
(
   id                   number(20) not null,
   title                varchar2(100),
   content              varchar2(1024),
   state                number(20) default 1 ,
   publisher            varchar2(20),
   publishTime          date default NULL ,
   typeId               number(10) default NULL ,
   typeName             varchar2(20),
   fileName             varchar2(60),
   filePath             varchar2(100),
   fileSize             number(10,2) default NULL ,
   uploadTime           date default NULL ,
   primary key (id)
);

--alter table information  'information';
insert  into information(id,title,content,state,publisher,publishTime,typeId,typeName,fileName,filePath,fileSize,uploadTime) values
 (38,'��Ѷ2','<font face=\"Arial, Verdana\" size=\"2\">��Ѷ2��Ѷ2��Ѷ2��Ѷ2��Ѷ2��Ѷ2��Ѷ2��Ѷ2</font>',1,'admin',to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),30,'�ı�','','',NULL,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
 insert  into information(id,title,content,state,publisher,publishTime,typeId,typeName,fileName,filePath,fileSize,uploadTime) values
 (37,'��Ѷ1','<h3 style=\"margin: 0px; font-family: Karla, sans-serif; color: rgb(49, 126, 172); varchar2(1024)-rendering: optimizelegibility; font-size: 18px; line-height: 27px; background-color: rgb(255, 255, 255);\">��Ѷ1<span style=\"font-weight: normal;\">��Ѷ1</span><span style=\"font-weight: normal;\">��Ѷ1</span><span style=\"font-weight: normal;\">��Ѷ1</span><span style=\"font-weight: normal;\">��Ѷ1</span><span style=\"font-weight: normal;\">��Ѷ1</span><span style=\"font-weight: normal;\">��Ѷ1</span></h3>',1,'admin',to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'),28,'ͼƬ','������.bmp','/statics/infofiles/1397113716035_info.bmp',3888026,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));

/*==============================================================*/
/* Table: leave_message                                         */
/*==============================================================*/
create table leave_message
(
   id                   number(20) not null,
   createdBy            varchar2(60),
   messageCode          varchar2(60),
   messageTitle         varchar2(60),
   messageContent       varchar2(1024),
   state                number(10) default NULL  ,
   createTime           date default NULL ,
   primary key (id)
);

--alter table leave_message  'leave_message';
insert  into leave_message(id,createdBy,messageCode,messageTitle,messageContent,state,createTime) values
 (52,'JBIT',NULL,NULL,'���Եڶ�������',0,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));
 insert  into leave_message(id,createdBy,messageCode,messageTitle,messageContent,state,createTime) values
 (51,'JBIT',NULL,NULL,'�ϴ�������ǿ��·����ĵĲ���лл����',1,to_date('2014-04-18 00:00:00','yyyy-MM-dd hh24:mi:ss'));

/*==============================================================*/
/* Table: reply                                                 */
/*==============================================================*/
create table reply
(
   id                   number(20) not null ,
   messageId            number(20) default NULL ,
   replyContent         varchar2(1024),
   createdBy            varchar2(20),
   createTime           date default NULL ,
   primary key (id)
);

--alter table reply  'reply';
insert  into reply(id,messageId,replyContent,createdBy,createTime) values (33,51,'�Ǵ�Ҷ�����ɣ��Ǻ�','admin',to_date('2000-11-25','yyyy-MM-dd'));

/*==============================================================*/
/* Table: uploadtemp                                            */
/*==============================================================*/
create table uploadtemp
(
   uploader             varchar2(20) default NULL,
   uploadType           varchar2(20) default NULL,
   uploadFilePath       varchar2(200) default NULL
);

insert  into uploadtemp(uploader,uploadType,uploadFilePath) values ('admin','info','/statics/infofiles/1396950789567_info.jpg');
insert  into uploadtemp(uploader,uploadType,uploadFilePath) values
('admin','info','/statics/infofiles/1396951051763_info.png');
insert  into uploadtemp(uploader,uploadType,uploadFilePath) values
('admin','info','/statics/infofiles/1396951079132_info.jpg');
insert  into uploadtemp(uploader,uploadType,uploadFilePath) values
('admin','info','/statics/infofiles/1396951400713_info.jpg');
insert  into uploadtemp(uploader,uploadType,uploadFilePath) values
('admin','info','/statics/infofiles/1397024384221_info.jpg');
insert  into uploadtemp(uploader,uploadType,uploadFilePath) values
('admin','info','/statics/infofiles/1397113789074_info.JPG');
insert  into uploadtemp(uploader,uploadType,uploadFilePath) values
('admin','info','/statics/infofiles/1397113716035_info.bmp');
