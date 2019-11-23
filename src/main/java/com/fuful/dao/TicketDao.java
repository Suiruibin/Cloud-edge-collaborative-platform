package com.fuful.dao;

import com.fuful.domain.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by SunRuiBin on 2019/11/14.
 */
@Repository
public interface TicketDao {
    public List<Book> findHotBook();
    public List<Book> findAllNewBook();
    public List<Book> findAllDiscountBook();
    public List<BookSuperType> findSuperType();
    public List<Ticket> findProductByCid(@Param("cid") int cid);
    public Ticket getTicketInfoById(@Param("id") int id);
    public int addTicketHit(@Param("hit") int hit,@Param("id") int id);
    public String getSuperTypeName(@Param("id") int id);
    public List<Mark> findMarkList(@Param("pid") int pid);
    public List<Mark> findMyMarkList(@Param("username") String  username);
    public boolean DeleteMark(@Param("mid") String  mid);
//    public BookLove getBookLove(@Param("uid") String uid, @Param("pid") int pid);
    public List<City> findAllPlaceByTid(@Param("tid") String tid);
    public List<Round> findRoundByPlace(@Param("tid") String tid,@Param("city") String city);
    public List<Price> findAllPriceByTid(@Param("tid") String tid);
    public List<Round> findAllPriceByLRT(@Param("tid") String tid,@Param("city") String city,@Param("round") String round);
    public List<TownInfo> findTownInfoList();
    public List<City> findTicketListByTown(@Param("town") String town);
}
