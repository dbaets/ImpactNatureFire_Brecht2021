# oppervlakte berekeneing image J


# Loading packages --------------------------------------------------------
library(tidyvers)

# Loading data ------------------------------------------------------------
area <- read.csv('data/Oppervlakte_substract.csv')
area <- read.csv('data/Oppervlakte_substract2.csv')


# Berekening --------------------------------------------------------------
# Breedte foto = 6.66km
# Foto: 560x478 (breedte x hoogte)

meting1 <- 6.22/478
meting2 <- 6.66/560

# omschaling naar km²
pixel_km <- mean(meting1,meting2) #km
pixel_m <- pixel_km*1000 #m
pixel_km2 <- pixel_km^2
pixel_m2 <- pixel_m^2

# oppervlakteberekening
tot_area <- sum(area$Area) #pixels

scaled_area <- tot_area*pixel_m2/10000


scaled_area/1571
scaled_area/570

