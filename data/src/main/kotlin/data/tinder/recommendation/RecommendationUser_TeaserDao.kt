package data.tinder.recommendation

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy

@Dao
internal interface RecommendationUser_TeaserDao {
  @Insert(onConflict = OnConflictStrategy.REPLACE)
  fun insertUser_Teaser(bond: RecommendationUserEntity_RecommendationUserTeaserEntity)
}
